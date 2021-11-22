package Practica2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Eje1GuardaPersonaYLee {
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
	enseñarPersona();
	}catch (Exception e) {
	cadena = "fallo en la creacion de Fichero";
	}
	return cadena;
}
	public static String enseñarPersona() throws IOException {
		try {
			BufferedReader Fichero = new BufferedReader(new FileReader(f));
			String linea = "",cadena = "";

			while((linea=Fichero.readLine())!=null) {
			cadena+= " -> "+linea;
			}
			Fichero.close();
			return cadena;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		
		
		return null;
	}
	}
}
