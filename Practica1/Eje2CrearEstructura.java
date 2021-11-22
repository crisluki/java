package Practica1;

import java.io.File;
import java.io.IOException;

public class Eje2CrearEstructura {
	public static void main(String[] args) {
	String ruta = "C:\\Users\\crisluki\\eclipse-workspace\\AD\\1Trimestre\\";
	String nombreFichero1 = "P1.txt";
	String nombreFichero2 = "UD1.txt";
	String nombreFichero3 = "UD2.txt";
	String nombreDirectorio1 = "AD";
	String nombreDirectorio2 = "PSP";

	File f1 = new File(ruta+"\\AD\\"+nombreFichero1);
	File f2 = new File(ruta+"\\AD\\"+nombreFichero2);
	File f3 = new File(ruta+"\\AD\\"+nombreFichero3);
	
	File f4 = new File(ruta+"\\PSP\\"+nombreFichero2);
	File f5 = new File(ruta+"\\PSP\\"+nombreFichero3);
	
	File f6 = new File(ruta+nombreDirectorio1);
	File f7 = new File(ruta+nombreDirectorio2);
	
	try {
		f6.mkdir();
		f1.createNewFile();
		f2.createNewFile();
		f3.createNewFile();
		f7.mkdir();
		f4.createNewFile();
		f5.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if((f1.exists()&&(f2.exists()&&(f3.exists()&&(f4.exists()&&(f5.exists()&&(f6.exists()&&(f7.exists()))))))))
		{
		System.out.println("existen los archivos");
		}
	}
}