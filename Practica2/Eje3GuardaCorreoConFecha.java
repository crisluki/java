package Practica2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Eje3GuardaCorreoConFecha {
		static File f;
		public static void guardarCorreo() {
		Scanner entrada = new Scanner(System.in);
		try {
		String ruta = "C:\\Users\\crisluki\\eclipse-workspace\\AD\\PrimerTrimestre";
		String correo = "correo.txt";
		f = new File(ruta,correo);
		if(!f.exists()) {f.createNewFile();}
		BufferedWriter Fichero = new BufferedWriter(new FileWriter(f));
		System.out.println("Destinatario");
		String Destinatario = entrada.nextLine();
		Fichero.write(Destinatario);
		System.out.println("Asunto");
		String Asunto = entrada.nextLine();
		Fichero.write(Asunto);
		System.out.println("Cuerpo del correo");
		String Cuerpo = entrada.nextLine();
		Fichero.write(Cuerpo);
		entrada.close();
		Fichero.close();
		enseñarCorreo();
		}catch (Exception e) {
		System.out.println("Error");
		}
		}
		private static String enseñarCorreo() throws IOException {
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
