package Practica1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Eje2CrearEstructura {

	static String ruta = "C:\\Users\\crisluki\\eclipse-workspace\\AD\\1Trimestre\\";
	static String nombreFichero1 = "P1.txt";
	static String nombreFichero2 = "UD1.txt";
	static String nombreFichero3 = "UD2.txt";
	static String nombreDirectorio1 = "AD";
	static String nombreDirectorio2 = "PSP";

	public static void main(String[] args) {
		var listaArchivos = new ArrayList<File>();

		listaArchivos.add(new File(ruta + "\\AD\\" + nombreFichero1));
		listaArchivos.add(new File(ruta + "\\AD\\" + nombreFichero2));
		listaArchivos.add(new File(ruta + "\\AD\\" + nombreFichero3));
		listaArchivos.add(new File(ruta + "\\PSP\\" + nombreFichero2));
		listaArchivos.add(new File(ruta + "\\PSP\\" + nombreFichero3));
		listaArchivos.add(new File(ruta + nombreDirectorio1));
		listaArchivos.add(new File(ruta + nombreDirectorio2));

		for (var i = 0; i < listaArchivos.size(); i++) {
			var archivo = listaArchivos.get(i);
			if (i == 6 || i == 7) {
				archivo.mkdir();
			} else {
				try {
					archivo.createNewFile();
				} catch (IOException e) {
					System.out.println("El archivo " + i + " ya estaba creado");
				}
			}
		}
		System.out.println("existen los archivos");
	}
}