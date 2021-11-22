package Practica5;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

public class menu {
	 static Scanner entradanumeros = new Scanner(System.in);
	 static Scanner entradatexto = new Scanner(System.in);
	public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerException {
			int opcion;
			do {
				System.out.println("Consultas[1]");
				System.out.println("Insercion[2]");
				System.out.println("Modificacion[3]");
				System.out.println("Borrado[4]");
				System.out.println("Listado general[5]");
				System.out.println("---------------------");
				System.out.println("Elige opcion:");
				opcion = entradanumeros.nextInt();
				switch (opcion) {
				case 1:
					System.out.println("***Consultas******");
					System.out.println("introduce los numeros del dni");
					try {
						int dni = entradanumeros.nextInt();
						System.out.println(AlmacenUmbrellaCorp.mostrarEmpleado(dni));
					}catch(InputMismatchException e){
						System.out.println("---------------------------------------------------------------");
						System.out.println("El formato es incorrecto. Introduce un numero entero");
						System.out.println("---------------------------------------------------------------");
						entradanumeros.nextLine();
					}
					break;
				case 2:
					System.out.println("***Insercion******");
					System.out.println("introduce los numeros del dni");
					int numerosdni = entradanumeros.nextInt();
					System.out.println("introduce la letra del dni");
					String letradni = entradatexto.nextLine();
					System.out.println("introduce el nombre");
					String nombre = entradatexto.nextLine();
					System.out.println("introduce los apellidos");
					String apellidos = entradatexto.nextLine();
					System.out.println("introduce el salario");
					try {
						Double salario = entradanumeros.nextDouble();
						AlmacenUmbrellaCorp.crearEmpleado(numerosdni, letradni, nombre, apellidos, salario);		
					}catch(InputMismatchException e) {
						System.out.println("---------------------------------------------------------------");
						System.out.println("El formato es incorrecto. Introduce cantidades con el formato XXXX,XX");
						System.out.println("---------------------------------------------------------------");
						entradanumeros.nextLine();
					}//int numerosDNI, String letraDNI, String nombre, String apellidos, double salario
					break;
				case 3:
					System.out.println("**Modificacion***");
					System.out.println("introduce los numeros del dni");
					int numerosdni2 = entradanumeros.nextInt();
					System.out.println("Introduce su nuevo salario");
					try {
						Double salarioNuevo = entradanumeros.nextDouble();		
						System.out.println(AlmacenUmbrellaCorp.modificarEmpleado(numerosdni2,salarioNuevo));				
					}catch(InputMismatchException e) {
						System.out.println("---------------------------------------------------------------");
						System.out.println("El formato es incorrecto. Introduce cantidades con el formato XXXX,XX");
						System.out.println("---------------------------------------------------------------");
						entradanumeros.nextLine();
					}
					break;
				case 4:
					System.out.println("****Borrado********");
					System.out.println("introduce los numeros del dni");
					int dniborrado = entradanumeros.nextInt();
					AlmacenUmbrellaCorp.borradoEmpleado(dniborrado);
					System.out.println("Borrado");
					break;
				case 5:
					System.out.println("*Listado general*");
					System.out.println(AlmacenUmbrellaCorp.mostrarListasEmpleados()); 
					break;
				default:
					System.out.println("**OPCION NO VALIDA**");
				}
			} while (opcion != 10);
	}
}
