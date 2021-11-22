package Practica5;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class AlmacenUmbrellaCorp {
	static String ruta = "C:\\Users\\crisluki\\eclipse-workspace\\AD\\1Trimestre";
	static String nombreFichero = "CobetaMendoza_Cristian_UD1_Practica5.xml";
	static File f = new File(ruta,nombreFichero);
	static ArrayList<Empleado>listaEmpleados = new ArrayList<Empleado>();
	// OPCIONES POSIBLES DE EMPLEADO
	public static String mostrarEmpleado (int numerosDNI) {
			String cadena="";
			if(listaEmpleados.isEmpty()) {
				cadena= "esta vacio el array";	
				}else {
					for (Empleado o: listaEmpleados) {
						if(o.getNumerosDNI()==numerosDNI) {
							cadena = o.toString();
						}
					}
				}
			return cadena;
		}
	public static String mostrarListasEmpleados () {
		String cadena="";
		if(listaEmpleados.isEmpty()) {
			cadena= "esta vacio el array";	
			}else {
				for (Empleado o: listaEmpleados) {
					cadena +=  o.toString()+"\n";
				}
			}
		return cadena;
	}
	public static void crearEmpleado(int numerosDNI, String letraDNI, String nombre, String apellidos, double salario) throws IOException, ParserConfigurationException, TransformerException {
		if(listaEmpleados.isEmpty()) {
			System.out.println("esta vacio el array");	
		}
			for (Empleado o: listaEmpleados) {
				if(o.getNumerosDNI()==numerosDNI) {
					System.out.println("Ya hay una persona con ese DNI");
				}
			}
				Empleado empl = new Empleado(numerosDNI,letraDNI,nombre,apellidos,salario);
				listaEmpleados.add(empl);
				System.out.println("Persona adjuntada, la lista estaba llena \n");
				guardarFichero();			
	}
	public static String modificarEmpleado(int numerosDNI, Double salarioNuevo) throws IOException, ParserConfigurationException, TransformerException {
		if (listaEmpleados.isEmpty()) {
			return "No hay ningún empleado.";
		}else 
		{
			for (Empleado o: listaEmpleados) {
				if(o.getNumerosDNI()==numerosDNI) {
					o.setSalario(salarioNuevo);
					guardarFichero();
					return "Creada modificacion";
				}
			}
			
		}
		return "pum";
	}
	public static void borradoEmpleado(int numerosDNI) {
		for (Empleado o: listaEmpleados) {
			if(o.getNumerosDNI()==numerosDNI) {
				listaEmpleados.remove(o);
			}
	}
	}
	//GUARDADO EN FICHERO ALEATORIO
	private static void guardarFichero() throws IOException, ParserConfigurationException, TransformerException{
		DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder =  documentFactory.newDocumentBuilder();
		Document document = (Document) documentBuilder.newDocument();
		Element root = document.createElement("AlmacenEmpleados");
        document.appendChild(root);
		for (Empleado o: listaEmpleados) {
			Element employee = document.createElement(o.getNombre());
	        root.appendChild(employee);
			Element lastname = document.createElement("lastname");
	        lastname.appendChild(document.createTextNode(o.getApellidos()));
	        employee.appendChild(lastname);
	        Element dni = document.createElement("dni");
            dni.appendChild(document.createTextNode(o.getNumerosDNI()+o.getLetraDNI()));
            employee.appendChild(dni);
            Element salario = document.createElement("salario");
            salario.appendChild(document.createTextNode(""+o.getSalario()));
            employee.appendChild(salario);
		}
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource = new DOMSource(document);
        StreamResult streamResult = new StreamResult(new File(ruta+nombreFichero));
        transformer.transform(domSource, streamResult);
	}
}
