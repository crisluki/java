package Practica1;

import java.io.File;
import java.io.IOException;

public class Eje1CrearFicheros {

	public static void main(String[] args) {
		String ruta = "C:\\Users\\crisluki\\eclipse-workspace\\AD\\1Trimestre\\";
		String nombreFichero = "Practica1CristianCobetaMendoza.txt";
		File f = new File(ruta+nombreFichero);
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("nombre: "+f.getName());
		System.out.println("ruta: "+f.getAbsolutePath());
		System.out.println("Directorio padre: "+f.getParent());
		if(f.exists()) {
			System.out.println("Existe el fichero");
			System.out.println("Permisos -> Lectura: "+f.canRead()+" Escritura: "+f.canWrite() +" Ejecucion: "+f.canExecute());
			System.out.println("Longitud de fichero: "+f.length());
		}else {
			System.out.println("El fichero no existe");
		}
	}
}
