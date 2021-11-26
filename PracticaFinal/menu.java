package PracticaFinal;
import java.io.IOException;
import java.util.Scanner;

public class Menu {

	static Scanner entradanumeros = new Scanner(System.in);
	static Scanner entradatexto = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
				int opcion;
				do {
					System.out.println("1->Crear Nombre de archivo y ruta");
					System.out.println("2->Mostrar Fichero");
					System.out.println("3->Estadisticas");
					System.out.println("4->Salir");
					System.out.println("---------------------");
					System.out.println("Elige opcion:");
					opcion = entradanumeros.nextInt();
					switch (opcion) {
					case 1:
						System.out.println("***Crear archivo***");
						System.out.println("Introduce el nombre del archivo a crear");
						String nombreArchivo = entradatexto.nextLine();
						System.out.println("Introduce una ruta -> Ruta recomendada [C:\\Users\\crisluki\\eclipse-workspace\\AD\\1Trimestre\\]");
						String rutaArchivo = entradatexto.nextLine();
						Intermediario.read(rutaArchivo+nombreArchivo);
						break;
					case 2:
						System.out.println("***Mostrar Archivo******");
						System.out.println(Intermediario.mostrarArchivo());
						break;
					case 3:
						System.out.println("**Mostrar Estadistica***");
						System.out.println(Intermediario.mostrarEstadisticas());
						break;
					case 4:
						System.out.println("Salir");
						break;
					default:
						System.out.println("**OPCION NO VALIDA**");
					}
				} while (opcion != 4);
	}
}
