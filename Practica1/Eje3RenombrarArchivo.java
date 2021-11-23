package Practica1;

import java.io.File;

public class Eje3RenombrarArchivo {
	public static void main(String[] args) {
		String ruta = "C:\\Users\\crisluki\\eclipse-workspace\\AD\\1Trimestre\\AD\\";
		String nombreFichero1 = "P1.txt";
		File f = new File(ruta + nombreFichero1);
		if (!f.exists()) {
			System.out.println("El archivo no existe");
		}
		System.out.println("Renombrando el archivo P1.txt -> practica1.txt");
		String nombreFNuevo = "practica1.txt";
		File f2 = new File(ruta + nombreFNuevo);
		String msg = f.renameTo(f2) ? "Cambiado satisfactoriamente" : "Ya ha sido cambiado";
		System.out.println(msg);
	}
}
