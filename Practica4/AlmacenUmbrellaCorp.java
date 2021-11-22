package Practica4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class AlmacenUmbrellaCorp {
	static File f;
	static ArrayList<Empleado>listaEmpleados = new ArrayList<Empleado>();
	// OPCIONES POSIBLES DE EMPLEADO
	public static String mostrarEmpleado (int numerosDNI) {
			String cadena="";
			if(listaEmpleados.isEmpty()) {
				cadena= "esta vacio el array";	
				}else {
					for (Empleado o: listaEmpleados) {
						if(o.getNumerosDNI()==numerosDNI) {
							cadena = o.toString();
						}
					}
				}
			return cadena;
		}
	public static String mostrarListasEmpleados () {
		String cadena="";
		if(listaEmpleados.isEmpty()) {
			cadena= "esta vacio el array";	
			}else {
				for (Empleado o: listaEmpleados) {
					cadena +=  o.toString()+"\n";
				}
			}
		return cadena;
	}
	public static void crearEmpleado(int numerosDNI, String letraDNI, String nombre, String apellidos, double salario) throws IOException {
		if(listaEmpleados.isEmpty()) {
			System.out.println("esta vacio el array");	
		}
			for (Empleado o: listaEmpleados) {
				if(o.getNumerosDNI()==numerosDNI) {
					System.out.println("Ya hay una persona con ese DNI");
				}
			}
				Empleado empl = new Empleado(numerosDNI,letraDNI,nombre,apellidos,salario);
				listaEmpleados.add(empl);
				System.out.println("Persona adjuntada, la lista estaba llena \n");
				guardarFichero();			
	}
	public static String modificarEmpleado(int numerosDNI, Double salarioNuevo) throws IOException {
		if (listaEmpleados.isEmpty()) {
			return "No hay ningún empleado.";
		}else 
		{
			if(listaEmpleados.get(numerosDNI)!=null) {
				try {
					String nombreNuevo = listaEmpleados.get(numerosDNI).getNombre();
					String apellidosNuevos = listaEmpleados.get(numerosDNI).getApellidos();
					int numerosNuevos = listaEmpleados.get(numerosDNI).getNumerosDNI();
					String letrasDniNuevo = listaEmpleados.get(numerosDNI).getLetraDNI();
					borradoEmpleado(numerosDNI);
					crearEmpleado(numerosNuevos,letrasDniNuevo,nombreNuevo,apellidosNuevos,salarioNuevo);
					return "Creada modificacion";
				}catch(InputMismatchException e) {
					return "hubo problemas";
				}
			}else {
				return "No existe coincidencias con el numero de dni";
			}
		}
	}
	public static void borradoEmpleado(int numerosDNI) {
		for (Empleado o: listaEmpleados) {
			if(o.getNumerosDNI()==numerosDNI) {
				listaEmpleados.remove(o);
			}
	}
	}
	//GUARDADO EN FICHERO ALEATORIO
	private static void guardarFichero() throws IOException{
		String ruta = "C:\\Users\\crisluki\\eclipse-workspace\\AD\\1Trimestre";
		String nombreFichero = "Fichero.txt";
		f = new File(ruta,nombreFichero);
		if(!f.exists()) {f.createNewFile();}
		BufferedWriter Fichero = new BufferedWriter(new FileWriter(f));
		for (Empleado o: listaEmpleados) {
			Fichero.write(o.toString()+"\n");
		}
		Fichero.close();
	}
}
