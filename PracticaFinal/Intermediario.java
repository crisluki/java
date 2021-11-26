package PracticaFinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

import Practica5.Empleado;

public class Intermediario {
	static String url1 = "C:\\Users\\crisluki\\eclipse-workspace\\AD\\1Trimestre\\CobetaMendoza_Cristian_PracticaFinal1.xml";
	static String url2 = "C:\\Users\\crisluki\\eclipse-workspace\\AD\\1Trimestre\\CobetaMendoza_Cristian_PracticaFinal2.xml";
	static String urlMediciones = "C:\\Users\\crisluki\\eclipse-workspace\\AD\\1Trimestre\\CobetaMendoza_Cristian_PracticaFinal2.xml";
	static File f1 = new File(url1);
	static File f2 = new File(url2);
	static ArrayList<Medicion>ListaCanales = new ArrayList<Medicion>();
	public static void read(String fichero) throws IOException{
		try {
			urlMediciones = fichero;
			var f3 = new File(urlMediciones);
            var sc = new Scanner(f3);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] details = line.split(",");
                int horas = Integer.parseInt(details[0]);
                int minutos = Integer.parseInt(details[1]);
                var nombre = details[2];
                var niños = Float.parseFloat(details[3]);
                var jovenes = Float.parseFloat(details[4]);
                var adultos = Float.parseFloat(details[5]);
                var mayores = Float.parseFloat(details[6]);
                var todos = Float.parseFloat(details[3]+details[4]+details[5]+details[6]);
                var p = new Medicion(horas,minutos,niños,jovenes,adultos,mayores,todos,nombre);
                ListaCanales.add(p);
                details
            }
            sc.close();
            for(Medicion p: ListaCanales){
                System.out.println(p.toString());
            }
        } catch (FileNotFoundException e) {         
            e.printStackTrace();
        }
	}
	public static char[] mostrarArchivo() {
		// TODO Auto-generated method stub
		return null;
	}
	public static char[] mostrarEstadisticas() {
		// TODO Auto-generated method stub
		return null;
	}
	private static void guardarFichero() throws IOException{
		var documentFactory = DocumentBuilderFactory.newInstance();
		var documentBuilder =  documentFactory.newDocumentBuilder();
		var document = (Document) documentBuilder.newDocument();
		var root = document.createElement("AlmacenEmpleados");
        document.appendChild(root);
		for (Medicion o: ListaCanales) {
			var employee = document.createElement(o.getNombre());
	        root.appendChild(employee);
			var lastname = document.createElement("lastname");
	        lastname.appendChild(document.createTextNode(o.getApellidos()));
	        employee.appendChild(lastname);
	        var dni = document.createElement("dni");
            dni.appendChild(document.createTextNode(o.getNumerosDNI()+o.getLetraDNI()));
            employee.appendChild(dni);
            var salario = document.createElement("salario");
            salario.appendChild(document.createTextNode(""+o.getSalario()));
            employee.appendChild(salario);
		}
		var transformerFactory = TransformerFactory.newInstance();
        var transformer = transformerFactory.newTransformer();
        var domSource = new DOMSource(document);
        var streamResult = new StreamResult(new File(url1));
        transformer.transform(domSource, streamResult);
	}
}
