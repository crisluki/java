package Practica2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Eje4GuardaUsuariosMostrarFiltro {
	static File f;
	public static String guardarPersona() {
	String cadena="correcto";
	Scanner entrada = new Scanner(System.in);
	try {
	String ruta = "C:\\Users\\crisluki\\eclipse-workspace\\AD\\PrimerTrimestre";
	String nombreFichero = "Fichero.txt";
	f = new File(ruta,nombreFichero);
	if(!f.exists()) {f.createNewFile();}
	BufferedWriter Fichero = new BufferedWriter(new FileWriter(f));
	System.out.println("DNI");
	String DNI = entrada.nextLine();
	Fichero.write(DNI);
	System.out.println("Nombre");
	String Nombre = entrada.nextLine();
	Fichero.write(Nombre);
	System.out.println("Apellidos");
	String Apellidos = entrada.nextLine();
	Fichero.write(Apellidos);
	System.out.println("Fecha Nacimiento");
	String FechaNacimiento = entrada.nextLine();
	Fichero.write(FechaNacimiento);
	System.out.println("Telefono");
	int Telefono = entrada.nextInt();
	Fichero.write(Telefono);
	entrada.close();
	Fichero.close();
	}catch (Exception e) {
	cadena = "fallo en la creacion de Fichero";
	}
	return cadena;
}
	public static String enseñarTodasPersona() throws IOException {
		String suma="";
		try {
		BufferedReader Fichero = new BufferedReader(new FileReader(f));
		String linea = "";

		while((linea=Fichero.readLine())!=null) {
		suma += linea;
		}
		Fichero.close();
		}catch (Exception e) {
		return "vacio";
		}
		return suma;

		}
	public static String enseñarNPersona(int numeroPersonas) throws IOException {
		try {
			BufferedReader Fichero = new BufferedReader(new FileReader(f));
			String linea = "",cadena = "";
			int cont = 0;
			ArrayList<String> Personas = new ArrayList<String>();
			while((linea=Fichero.readLine())!=null) {
			Personas.add(cont, linea);
			cont ++;
			}
			for(int conti=0;conti>=numeroPersonas;conti++) {
				cadena = Personas.get(conti);
			}
			Fichero.close();
			return cadena;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		return null;
	}
	}
	public static String enseñarDNIPersona(String dni) throws IOException {
		try {
			BufferedReader Fichero = new BufferedReader(new FileReader(f));
			String linea = "",cadena = "";
			int cont = 0;
			ArrayList<String> Personas = new ArrayList<String>();
			while((linea=Fichero.readLine())!=null) {
			Personas.add(cont, linea);
			cont ++;
			}
			for(int conti=0;conti>=Personas.size();conti++) {
				if(Personas.get(conti)==dni) {
					cadena = Personas.get(conti);
				}
			}
			Fichero.close();
			return cadena;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		return null;
	}
	}
	public static void eleccionDelMenu(int numero) throws IOException {
		if(numero == 1) {
			enseñarTodasPersona();
		}
		if(numero == 2) {
			enseñarNPersona(numero);
		}
	}
}