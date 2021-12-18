package Prueba1;
import java.util.Scanner;

public class Ejercicio3 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) { 
		int opcion;
			registro();
		do {
			menu();
			opcion = scanner.nextInt();
			scanner.nextLine();
			switch (opcion) {
			case 0: System.out.println("Exit..");
					break;
			case 1: System.out.println("-Mostrando empleados-");
		 			System.out.println(Ejercicio3Conectores.listarEmpleados());
		 			break;
			case 2: System.out.println("Mostrando empleado por NIF");
					System.out.println("Introduce NIF");
					String nifBusqueda = scanner.nextLine();
					System.out.println(Ejercicio3Conectores.nifEmpleado(nifBusqueda));
					break;
			case 3: System.out.println("Mostrando empleados con salario superior a..\n Introduce salario");
					float salarioBusqueda = scanner.nextFloat();
					System.out.println(Ejercicio3Conectores.salarioEmpleado(salarioBusqueda));
					break;
			case 4: System.out.println("Mostrando empleados con salario inferior o igual a..\n Introduce salario");
					float salario2Busqueda = scanner.nextFloat();
					System.out.println(Ejercicio3Conectores.salario2Empleado(salario2Busqueda));
					break;
			default:System.out.println("**OPCION NO VALIDA**");
			}
		} while (opcion != 0);
	}
	private static void registro() {
		System.out.println("Mete usuario");
		String usuario = scanner.nextLine();
		System.out.println("Mete usuario");
		String password = scanner.nextLine();
		Ejercicio3Conectores.registro(usuario,password);
	}
	public static void menu() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("0->Salir");
		System.out.println("1->Consultar todos los empleados");
		System.out.println("2->Consultar empleados por el nif");
		System.out.println("3->Consultar los empleados que tengan un salario superior al introducido por el usuario.");
		System.out.println("4->Consultar empleados que tengan un salario igual o inferior al introducido por el usuario");
		System.out.println("---------------------------------------------------------------");
		System.out.println("Elige opcion:");
	}
}
