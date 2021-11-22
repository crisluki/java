package Practica3;

import java.util.ArrayList;
public class Vuelo {

	static ArrayList<Integer>vuelo = new ArrayList<Integer>();
	static ArrayList<Hotel>hotel = new ArrayList<Hotel>();
	static ArrayList<Paquete>paquete = new ArrayList<Paquete>();
	Paquete paquet = new Paquete();
	Hotel hoteles = new Hotel();
															// Listar los ArrayList
	public String listarVuelos() {
		String cadena="";
		for (Integer o: vuelo) {
			
			cadena += o.toString()+"\n";
		}
		return cadena;
	}
	public String listarHoteles() {
		String cadena="";
		for (Hotel o: hotel) {
			cadena +=  o.toString();
		}
		return cadena;
	}
	public String listarPaquetes() {
		String cadena="";
		for (Paquete o: paquete) {
			cadena += o.toString();
		}
		return cadena;
	}
															//Borrar elementos del ArrayList
	public String borrarHotel(int opHotelBorrar) {
		if(!hotel.isEmpty()) {
			hotel.remove(opHotelBorrar);
			return "borrado";
		}else {
			return "no existe";
		}
	}
	public String borrarVuelo(int opcionVuelo) {
		if(!vuelo.isEmpty()) {
			vuelo.remove(opcionVuelo);
			return "borrado";
		}else {
			return "no existe";
		}
	}
	public String borrarPaquete(int opPaqueteBorrar) {
		if(!paquete.isEmpty()) {
			paquete.remove(opPaqueteBorrar);
			return "borrado";
		}else {
			return "no existe";
		}
	}
															//Introducir en el ArrayList
	public char[] addVuelo(int idVuelo) {
		vuelo.add(idVuelo);
		return null;
	}
	public String addHotel(int idHotel, String nombreHotel, String descripHotel, String nombreCiudadHotel,int precioHotel) {
		try {
			int num;
		Hotel hotel1 = new Hotel(nombreHotel,descripHotel,nombreCiudadHotel,precioHotel,idHotel);//String nombreHotel, String descripcion, String ciudadHotel, int precioPorNoche, int idhote
		if(hotel.size()==0) {
			num = 0;
		}else {
			num = hotel.size()+1;
		}
		hotel.add(num, hotel1);
		return "Completado";
		}catch(IllegalArgumentException e){
			return "Ya existe";
		}
	}
	public String addPaquete(String fechaIni, String fechaFin, int opcViajePaqueteIda, int opcViajePaqueteVuelta,int opcPaqueteHotel, String idPaquete) {
		try {
			String paquetepack="",paq1="",paq2="";
			for(Integer o : vuelo) {
				if(o.equals(vuelo.get(opcViajePaqueteIda))){
					paq1 = vuelo.get(opcPaqueteHotel).toString();
				}
			}
			for(Integer o : vuelo) {
				if(o.equals(vuelo.get(opcViajePaqueteVuelta))){
					paq2 = vuelo.get(opcPaqueteHotel).toString();
				}
			}
		for(Hotel o : hotel) {
			if(o.equals(hotel.get(opcPaqueteHotel))){
				paquetepack = hotel.get(opcPaqueteHotel).toString();
			}
		}
		Paquete paquete1 = new Paquete(idPaquete,fechaIni,fechaFin,paq1,paq2,paquetepack);//String identificadorMarketing, String fechaInicio, String fechaFin, String vueloIda, String vueloVuelta,String estanciaHotel
		paquete.add(paquete1);
		return "Completado";
		}catch(IllegalArgumentException e){
		return "Ya existe";
	}
}
}
