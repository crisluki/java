package Practica1;

import java.io.File;
import java.util.Scanner;

public class Eje4SacarArchivosDeCarpeta {
	public static void main(String[] args) {
		String ruta = "C:\\Users\\crisluki\\eclipse-workspace\\AD\\1Trimestre\\AD\\";
		int opcion;
		File f = new File(ruta);
		Scanner entrada = new Scanner(System.in);
		if(f.exists()){
			System.out.println("¿Que quiere sacar [1]-> Mostrar archivos [2]-> Mostrar rutas");
			opcion = entrada.nextInt();
			if(opcion==1) {
				mostrarArchivos();
			}
			if(opcion==2) {
				mostrarRutas();
			}
		}else {
			System.out.println("El archivo no existe");
		}
		entrada.close();
	}
	public static void mostrarArchivos() {
			String ruta = "C:\\Users\\crisluki\\eclipse-workspace\\AD\\1Trimestre\\AD";
			File f = new File(ruta);
			String[] listFiles= f.list();
			if(f.exists()){
				System.out.println("Buscando archivos de AD");
				for(String file: listFiles){
					System.out.println(file);
				}
			}else {
				System.out.println("El archivo no existe");
			}
	}
	public static void mostrarRutas() {
		String ruta = "C:\\Users\\crisluki\\eclipse-workspace\\AD\\1Trimestre\\AD\\";
		File f = new File(ruta);
		File [] listFiles= f.listFiles();
		if(f.exists()){
			System.out.println("Buscando archivos de AD");
			for(File file: listFiles){
				System.out.println(file);
			}
		}else {
			System.out.println("El archivo no existe");
		}
}
}
