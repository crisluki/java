package Practica2;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
	static Scanner entradanumeros = new Scanner(System.in);
	static Scanner entradatexto = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		int opcion;
		do {
			System.out.println("*********************************");
			System.out.println("****1*Guardar Persona********");
			System.out.println("****2*Guardar Personas hasta 0**********");
			System.out.println("****3*Guardar correo*******");
			System.out.println("****4*Guardar usuarios y busqueda con filtro********");
			System.out.println("***********Elige opcion:***********");
			opcion = entradanumeros.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("*********Guardar Persona**********");
				Eje1GuardaPersonaYLee.guardarPersona();
				break;
			case 2:
				System.out.println("*********Guardar Personas hasta 0**********");
				Eje2GuardaPersonaHasta0.pedirdatos();
				break;
			case 3:
				System.out.println("*********Guardar correo**********");
				Eje3GuardaCorreoConFecha.guardarCorreo();
				break;
			case 4:
				System.out.println("*********Guardar usuarios y busqueda con filtro**********");
				Eje4GuardaUsuariosMostrarFiltro.guardarPersona();
				System.out.println("Introduce:[1]->Mostrar todos[2]->Mostrar un numero de Personas[3]->Mostrar por DNI");
				int numero = entradanumeros.nextInt();
				if(numero==3) {
					System.out.println("Introduce el DNI");
					String dni=entradatexto.nextLine();
					Eje4GuardaUsuariosMostrarFiltro.enseñarDNIPersona(dni);
				}
				Eje4GuardaUsuariosMostrarFiltro.eleccionDelMenu(numero);
				break;
			default:
				System.out.println("*********OPCION NO VALIDA**********");
			}
		} while (opcion != 10);
}
}