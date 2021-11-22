package Practica1;

import java.io.File;
public class Ejer5Opcional {
	public static void main(String[] args) {
	String ruta = "C:\\Users\\crisluki\\eclipse-workspace\\AD\\1Trimestre";
	File directorio = new File(ruta);
	File[] listFiles=directorio.listFiles();
	for(File file: listFiles) {
		if (file.isDirectory()) 
		{
			for(File file2: file.listFiles()) 
			{
				if (file2.getName().endsWith(".txt") || file2.getName().endsWith(".TXT")) 
				{
					System.out.println(file2.getName());
				}
			}
		}
	}
	}
}
