package Practica3;
import java.io.IOException;
import java.util.Scanner;

public class menu {
	static Scanner entradanumeros = new Scanner(System.in);
	static Scanner entradatexto = new Scanner(System.in);
	static Vuelo vuelo = new Vuelo();
	public static void main(String[] args) throws IOException {
		int opcion;
		do {
			System.out.println("Gestionar Vuelos:");
			System.out.println("   1-Listar");
			System.out.println("   2-Introducir, modificar o borrar.");
			System.out.println("Gestionar Hoteles:");
			System.out.println("   3-Listar");
			System.out.println("   4-Introducir, modificar o borrar.");
			System.out.println("Gestionar paquetes de viajes:");
			System.out.println("   5-Listar");
			System.out.println("   6-Introducir, modificar o borrar.");
			System.out.println("***********Elige opcion:***********");
			opcion = entradanumeros.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("*********Listar**********");
				System.out.println(vuelo.listarVuelos());
				break;
			case 2:
				MenuVuelos();
				break;
			case 3:
				System.out.println("*********Listar**********");
				System.out.println(vuelo.listarHoteles());
				break;
			case 4:
				MenuHoteles();
				break;
			case 5:
				System.out.println("*********Listar**********");
				System.out.println(vuelo.listarPaquetes());
				break;
			case 6:
				MenuPaquete();
				break;
			default:
				System.out.println("*********OPCION NO VALIDA**********");
			}
		} while (opcion != 10);
}
	private static void MenuVuelos() {
		System.out.println("Elige: [1]->Introducir[2]->Modificar[3]->Borrar");
		int numero = entradanumeros.nextInt();
		if((numero == 1)||(numero == 2)||(numero == 3)) {
			if(numero == 1) {
				System.out.println("Vuelo nuevo");
				System.out.println("introduce su id");
				int idVuelo = entradanumeros.nextInt();
				vuelo.addVuelo(idVuelo);
			}
			if(numero == 2) {
				System.out.println("Modificar vuelo");
				System.out.println("Elige entre los vuelos");
				System.out.println(vuelo.listarVuelos());
				System.out.println("introduce el vuelo");
				int opVueloModif = entradanumeros.nextInt();
				vuelo.addVuelo(opVueloModif);
			}
			if(numero == 3) {
				System.out.println("Borrar vuelo");
				System.out.println("Elige entre los vuelos");
				System.out.println(vuelo.listarVuelos());
				System.out.println("introduce el vuelo");
				int opVueloBorrar = entradanumeros.nextInt();
				vuelo.borrarVuelo(opVueloBorrar);
			}
		}else {
			System.out.println("No has introducido una opcion posible");
		}
	}
	private static void MenuHoteles() {
		System.out.println("Elige: [1]->Introducir[2]->Modificar[3]->Borrar");
		int numero = entradanumeros.nextInt();
		if((numero == 1)||(numero == 2)||(numero == 3)) {
			if(numero == 1) {
				System.out.println("Hotel nuevo");
				System.out.println("introduce el nombre del hotel");
				String nombreHotel = entradatexto.nextLine();
				System.out.println("introduce la descripcion del hotel");
				String descripHotel = entradatexto.nextLine();
				System.out.println("introduce el nombre de la ciudad");
				String nombreCiudadHotel = entradatexto.nextLine();
				System.out.println("introduce el precio por noche del hotel");
				int precioHotel = entradanumeros.nextInt();
				System.out.println("introduce el id del hotel");
				int idHotel = entradanumeros.nextInt();
				vuelo.addHotel(idHotel,nombreHotel,descripHotel,nombreCiudadHotel,precioHotel);
			}
			if(numero == 2) {
				System.out.println("Modificar Hotel");
				System.out.println("Elige entre los Hoteles");
				System.out.println(vuelo.listarHoteles());
				int opcModHotel = entradanumeros.nextInt();
				vuelo.borrarHotel(opcModHotel);
				System.out.println("Hotel nuevo");
				System.out.println("introduce el nombre del hotel");
				String nombreHotel = entradatexto.nextLine();
				System.out.println("introduce la descripcion del hotel");
				String descripHotel = entradatexto.nextLine();
				System.out.println("introduce el nombre de la ciudad");
				String nombreCiudadHotel = entradatexto.nextLine();
				System.out.println("introduce el precio por noche del hotel");
				int precioHotel = entradanumeros.nextInt();
				System.out.println("introduce el id del hotel");
				int idHotel = entradanumeros.nextInt();
				vuelo.addHotel(idHotel, nombreHotel, descripHotel, nombreCiudadHotel, precioHotel);
			}
			if(numero == 3) {
				System.out.println("Borrar Hotel");
				System.out.println("Elige entre los Hoteles");
				System.out.println(vuelo.listarHoteles());
				System.out.println("introduce el Hotel");
				int opHotelBorrar = entradanumeros.nextInt();
				vuelo.borrarHotel(opHotelBorrar);
			}
		}else {
			System.out.println("No has introducido una opcion posible");
		}
	}
	private static void MenuPaquete() {//String idMarketing, String fechaInicio, String fechaFin, String vueloIda, String vueloVuelta,String estanciaHotel
		System.out.println("Elige: [1]->Introducir[2]->Modificar[3]->Borrar");
		int numero = entradanumeros.nextInt();
		if((numero == 1)||(numero == 2)||(numero == 3)) {
			if(numero == 1) {
				System.out.println("Nuevo viaje");
				System.out.println("introduce la fecha de inicio");
				String fechaIni = entradatexto.nextLine();
				System.out.println("introduce la fecha fin");
				String fechaFin = entradatexto.nextLine();
				System.out.println("introduce el vuelo de ida");
			    System.out.println(vuelo.listarVuelos());
			    int opcViajePaqueteIda = entradanumeros.nextInt();
				System.out.println("introduce el vuelo de vuelta");
				System.out.println(vuelo.listarVuelos());
				int opcViajePaqueteVuelta = entradanumeros.nextInt();
				System.out.println("introduce la estancia del hotel");
				System.out.println(vuelo.listarHoteles());
				int opcPaqueteHotel = entradanumeros.nextInt();
				System.out.println("introduce el id del Paquete");
				String idPaquete = entradatexto.nextLine();
				vuelo.addPaquete(fechaIni,fechaFin,opcViajePaqueteIda,opcViajePaqueteVuelta,opcPaqueteHotel,idPaquete);
			}
			if(numero == 2) {
				System.out.println("Modificar viaje");
				System.out.println("Elige entre los viajes");
				System.out.println(vuelo.listarVuelos());
				System.out.println("Nuevo viaje");
				System.out.println("introduce la fecha de inicio");
				String fechaIni = entradatexto.nextLine();
				System.out.println("introduce la fecha fin");
				String fechaFin = entradatexto.nextLine();
				System.out.println("introduce el vuelo de ida");
			    System.out.println(vuelo.listarVuelos());
			    int opcViajePaqueteIda = entradanumeros.nextInt();
				System.out.println("introduce el vuelo de vuelta");
				System.out.println(vuelo.listarVuelos());
				int opcViajePaqueteVuelta = entradanumeros.nextInt();
				System.out.println("introduce la estancia del hotel");
				System.out.println(vuelo.listarHoteles());
				int opcPaqueteHotel = entradanumeros.nextInt();
				System.out.println("introduce el id del Paquete");
				String idPaquete = entradatexto.nextLine();
				vuelo.addPaquete(fechaIni,fechaFin,opcViajePaqueteIda,opcViajePaqueteVuelta,opcPaqueteHotel,idPaquete);
			}
			if(numero == 3) {
				System.out.println("Borrar paquete");
				System.out.println("Elige entre los paquetes");
				System.out.println(vuelo.listarPaquetes());
				System.out.println("introduce el viaje");
				int opViajeBorrar = entradanumeros.nextInt();
				vuelo.borrarPaquete(opViajeBorrar);
			}
		}else {
			System.out.println("No has introducido una opcion posible");
		}
	}
}