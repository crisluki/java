package PracticaUltimate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

public class GestionEmpleados {
static String url1 = "C:\\Users\\crisluki\\eclipse-workspace\\AD\\1Trimestre\\CobetaMendoza_Cristian_PracticaUltimate1.xml";
static String url2 = "C:\\Users\\crisluki\\eclipse-workspace\\AD\\1Trimestre\\CobetaMendoza_Cristian_PracticaUltimate2.xml";
static File f1 = new File(url1);
static File f2 = new File(url2);
static ArrayList<Departamento> listaDepartamentos = new ArrayList<Departamento>();
static ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

public static void crearPersona(String dniPersona, String nombrePersona, String apellidosPersona, float salario,
		int generoPersona, int idDepartamentoPersona) {//int iD, String dNI, String nombre, String apellidos, float salario, boolean generoMposFneg,int iDDepartamento
	boolean exit = false;
	for(Persona o : listaPersonas) {
		if(o.getdNI().equalsIgnoreCase(dniPersona)) {
			exit = true;
		}
	}
	if(!exit) {
	boolean genero = false;
		if(generoPersona == 1) {
			genero = true;
		}
		var p = new Persona(listaPersonas.size(),dniPersona,nombrePersona,apellidosPersona,salario,genero,idDepartamentoPersona);
        listaPersonas.add(p);
	}else { System.out.println("Ya hay una persona con ese dni"); }
}

public static void actualizarArrayPersonas() throws ParserConfigurationException, TransformerException {
	try {
		File f1 = new File("C:\\Users\\crisluki\\eclipse-workspace\\AD\\1Trimestre\\PracticaFinal\\personas.txt");
		Scanner sc = new Scanner(f1);
        while(sc.hasNextLine()){
        	String line = sc.nextLine();
            String[] details = line.split(",");
            int id = Integer.parseInt(details[0]);
            String dni = details[1];
            String nombre = details[2];
            String apellidos = details[3];
            float salariO = Float.parseFloat(details[4]);
            boolean genero = Boolean.valueOf(details[5]);
            int idDepartamento = Integer.parseInt(details[6]);
            var p = new Persona(id,dni,nombre,apellidos,salariO,genero,idDepartamento);
            listaPersonas.add(p);
            guardarEnFicheroPersona();
        }
        sc.close();
        for(Persona p: listaPersonas){
            System.out.println(p.toString());
        }
    } catch (FileNotFoundException e) {         
        e.printStackTrace();
    }
}

public static void actualizarArrayDepartamentos() throws ParserConfigurationException, TransformerException {
	try {
		File f1 = new File("C:\\Users\\crisluki\\eclipse-workspace\\AD\\1Trimestre\\PracticaFinal\\departamentos.txt");
		Scanner sc = new Scanner(f1);
        while(sc.hasNextLine()){
        	String line = sc.nextLine();
            String[] details = line.split(",");
            int idDepartamento = Integer.parseInt(details[0]);
            String nombreDepartamento = details[1];
            var p = new Departamento(idDepartamento,nombreDepartamento);//int idDepartamentoAdd, String nombreDepartamentoAdd
            listaDepartamentos.add(p);
            guardarEnFicheroPersona();
        }
        sc.close();
        for(Departamento p: listaDepartamentos){
            System.out.println(p.toString());
        }
    } catch (FileNotFoundException e) {         
        e.printStackTrace();
    }
}

public static void modifPersona(String dniPersonaModif, float salarioModif) {
	for(Persona o : listaPersonas) {
		if(o.getdNI().equalsIgnoreCase(dniPersonaModif)) {
			o.setSalario(salarioModif);
		}
	}
}

public static String listarEmpleados() {
	String listaPersonasa="";
	 for(Persona p: listaPersonas){
		 listaPersonasa+= p.toString()+"\n";
     }
	return listaPersonasa;
}

public static String listarDepartamentoId(int idDepartamento) {
	String listaDepartamentoss="";
	 for(Departamento p: listaDepartamentos){
		 if(p.getIdDepartamento()==idDepartamento) {
			 listaDepartamentoss = p.toString();
		 }
    }
	return listaDepartamentoss;
}

public static String listarEmpleadoDni(String dNIPersona) {
	String listaPersonasa="";
	 for(Persona p: listaPersonas){
		 if(p.getdNI().equalsIgnoreCase(dNIPersona)) {
		 listaPersonasa = p.toString();
		 } 
    }
	return listaPersonasa;
}

public static String listarEmpleadosSalario(float salarioConsultaMas) {
	String listaPersonasa="";
	 for(Persona p: listaPersonas){
		 if(p.getSalario()>salarioConsultaMas) {
		 listaPersonasa = p.toString()+"\n";
		 } 
   }
	return listaPersonasa;
}

public static String listarEmpleadosSalarioMenor(float salarioConsultaMenor) {
	String listaPersonasa="";
	 for(Persona p: listaPersonas){
		 if(p.getSalario()<=salarioConsultaMenor) {
		 listaPersonasa = p.toString()+"\n";
		 } 
  }
	return listaPersonasa;
}

public static void crearDepartamento(int idDepartamentoAdd, String nombreDepartamentoAdd) {
	boolean exit = false;
	for(Departamento o : listaDepartamentos) {
		if(o.getIdDepartamento()==idDepartamentoAdd) {
			exit = true;
		}
	}
	if(!exit) {
		var p = new Departamento(idDepartamentoAdd,nombreDepartamentoAdd);
		listaDepartamentos.add(p);
	}else { System.out.println("Ya hay un departamento con ese id"); }
}

public static void modifDepartamento(int idDepartamentoModif, String nombreDepartamentoModif) {
	for(Departamento o : listaDepartamentos) {
		if(o.getIdDepartamento()==idDepartamentoModif) {
			o.setNombre(nombreDepartamentoModif);
		}
	}
}

public static void borrarDepartamento(int idDepartamentoDel) {
	for(Departamento o : listaDepartamentos) {
		if(o.getIdDepartamento()==idDepartamentoDel) {
			listaDepartamentos.remove(idDepartamentoDel);
		}
	}
}

public static String listarDepartamentos() {
	String listarDepartamentoss="";
	 for(Departamento p: listaDepartamentos){
		 listarDepartamentoss+= p.toString()+"\n";
    }
	return listarDepartamentoss;
}

public static String listarDepartamentoName(String nombreDepartamentoListar) {
	String listarDepartamentoss="";
	 for(Departamento p: listaDepartamentos){
		 if(p.getNombre().equalsIgnoreCase(nombreDepartamentoListar)) {
			 listarDepartamentoss+= p.toString()+"\n";
		 }
   }
	return listarDepartamentoss;
}

public static void guardarEnFicheroPersona() throws ParserConfigurationException, TransformerException {
	String generoST="";
	var documentFactory = DocumentBuilderFactory.newInstance();
	var documentBuilder =  documentFactory.newDocumentBuilder();
	var document = (Document) documentBuilder.newDocument();
	var root = document.createElement("ListadoMediciones");
    document.appendChild(root);
	for (Persona o: listaPersonas) {//int iD, String dNI, String nombre, String apellidos, float salario, boolean generoMposFneg,int iDDepartamento
		var Linea = document.createElement(o.getNombre());
        root.appendChild(Linea);
		var id = document.createElement("id");
        Linea.appendChild(id);
		Linea.appendChild(document.createTextNode(o.getiD()+""));
        var dni = document.createElement("dni");
        Linea.appendChild(dni);
        Linea.appendChild(document.createTextNode(o.getdNI()));
        var Nombre = document.createElement("nombre");
        Linea.appendChild(Nombre);
        Linea.appendChild(document.createTextNode(o.getNombre()+""));
        var apellidos = document.createElement("apellidos");
        Linea.appendChild(apellidos);
        Linea.appendChild(document.createTextNode(o.getApellidos()+""));
        var salario = document.createElement("salario");
        Linea.appendChild(salario);
        Linea.appendChild(document.createTextNode(o.getSalario()+""));
        if(o.isGeneroMposFneg()) {generoST = "masculino";}else {generoST="femenino";}
        var genero = document.createElement("genero");
        Linea.appendChild(genero);
        Linea.appendChild(document.createTextNode(generoST));
        var idDepartamento = document.createElement("idDepartamento");
        Linea.appendChild(idDepartamento);
        Linea.appendChild(document.createTextNode(o.getiDDepartamento()+""));
	}
	var transformerFactory = TransformerFactory.newInstance();
    var transformer = transformerFactory.newTransformer();
    var domSource = new DOMSource(document);
    var streamResult = new StreamResult(new File(url1));
    transformer.transform(domSource, streamResult);
}
public static void guardarEnFicheroDepartamento() throws TransformerException, ParserConfigurationException {
	var documentFactory = DocumentBuilderFactory.newInstance();
	var documentBuilder =  documentFactory.newDocumentBuilder();
	var document = (Document) documentBuilder.newDocument();
	var root = document.createElement("ListadoMediciones");
    document.appendChild(root);
	for (Departamento o: listaDepartamentos) {//int iD, String dNI, String nombre, String apellidos, float salario, boolean generoMposFneg,int iDDepartamento
		var Linea = document.createElement(o.getNombre());
        root.appendChild(Linea);
		var id = document.createElement("id");
        Linea.appendChild(id);
		Linea.appendChild(document.createTextNode(o.getIdDepartamento()+""));
        var Nombre = document.createElement("nombre");
        Linea.appendChild(Nombre);
        Linea.appendChild(document.createTextNode(o.getNombre()+""));
	}
	var transformerFactory = TransformerFactory.newInstance();
    var transformer = transformerFactory.newTransformer();
    var domSource = new DOMSource(document);
    var streamResult = new StreamResult(new File(url2));
    transformer.transform(domSource, streamResult);
}
}
