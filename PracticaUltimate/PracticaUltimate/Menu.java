package PracticaUltimate;

import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;


public class Menu {
		static Scanner entradanumeros = new Scanner(System.in);
		static Scanner entradatexto = new Scanner(System.in);
		public static void main(String[] args) throws IOException, TransformerException, ParserConfigurationException {
					int opcion;
					do {
						GestionEmpleados.actualizarArrayDepartamentos();
						GestionEmpleados.actualizarArrayPersonas();
						System.out.println("--------------------------------------------------------------");
						System.out.println("0->Salir");
						System.out.println("1->Insertar Empleado");
						System.out.println("2->Modificar empleado");
						System.out.println("3->Lista todos los empleados");
						System.out.println("4->Lista todos los empleados de un departamento");
						System.out.println("5->Consulta empleados por nif/dni");
						System.out.println("6->Consulta empleados que tengan un salario superior al introducido");
						System.out.println("7->Consulta empleados que tengan un salario igual o inferior al introducido");
						System.out.println("8->Insertar Departamento");
						System.out.println("9->Modificar Departamento");
						System.out.println("10->Eliminar Departamento");
						System.out.println("11->Listar todos los departamentos");
						System.out.println("12->Ver informacion departamento por nombre");
						System.out.println("13->Ver informacion departamento por id");
						System.out.println("---------------------------------------------------------------");
						System.out.println("Elige opcion:");
						opcion = entradanumeros.nextInt();
						entradanumeros.nextLine();
						switch (opcion) {
						case 0:
							System.out.println("Salir");
							break;
						case 1:
							System.out.println("<----Insertar Persona------>");
							System.out.println("Introduce su dNI");
							String dniPersona = entradatexto.nextLine();
							System.out.println("Introduce su nombre");
							String nombrePersona = entradatexto.nextLine();
							System.out.println("Introduce sus apellidos");
							String apellidosPersona = entradatexto.nextLine();
							System.out.println("Intoduce su salario");
							float salario = entradanumeros.nextFloat();
							System.out.println("¿Es de genero masculino[1] o femenino[2]?");
							int generoPersona = entradanumeros.nextInt();
							System.out.println("id de su departamento");
							int idDepartamentoPersona = entradanumeros.nextInt();
							GestionEmpleados.crearPersona(dniPersona,nombrePersona,apellidosPersona,salario,generoPersona,idDepartamentoPersona);							
							break;
						case 2:
							System.out.println("Modificar persona");
							System.out.println("Introduce su DNI");
							String dniPersonaModif = entradatexto.nextLine();
							System.out.println("Introduce su Salario");
							float salarioModif = entradanumeros.nextFloat();
							GestionEmpleados.modifPersona(dniPersonaModif,salarioModif);
							break;
						case 3:
							System.out.println(GestionEmpleados.listarEmpleados());
							break;
						case 4:
							System.out.println("Introduce el id del departamento");
							int idDepartamento = entradanumeros.nextInt();
							System.out.println(GestionEmpleados.listarDepartamentoId(idDepartamento));
							break;
						case 5:
							System.out.println("Introduce DNI de la persona a consultar");
							String dNIPersonaConsulta = entradatexto.nextLine();
							System.out.println(GestionEmpleados.listarEmpleadoDni(dNIPersonaConsulta));
							break;
						case 6:
							System.out.println("Consulta empleados con salario mayor a..");
							System.out.println("introduce un salario (00,00)");
							float salarioConsultaMas = entradanumeros.nextFloat();
							System.out.println(GestionEmpleados.listarEmpleadosSalario(salarioConsultaMas));
							break;
						case 7:
							System.out.println("Consulta empleados con salario igual o menor a...");
							System.out.println("introduce un salario (00,00)");
							float salarioConsultaMenor = entradanumeros.nextFloat();
							System.out.println(GestionEmpleados.listarEmpleadosSalarioMenor(salarioConsultaMenor));
							break;
						case 8:
							System.out.println("<----------Insertar Departamento----->");
							System.out.println("Introduce su idDepartamento");
							int idDepartamentoAdd = entradanumeros.nextInt();
							System.out.println("Introduce nombre de Departamento");
							String nombreDepartamentoAdd = entradatexto.nextLine();
							GestionEmpleados.crearDepartamento(idDepartamentoAdd,nombreDepartamentoAdd);
							break;
						case 9:
							System.out.println("Introduce su idDepartamento");
							int idDepartamentoModif = entradanumeros.nextInt();
							System.out.println("Introduce nombre de Departamento");
							String nombreDepartamentoModif = entradatexto.nextLine();
							GestionEmpleados.modifDepartamento(idDepartamentoModif,nombreDepartamentoModif);
							break;
						case 10:
							System.out.println("Introduce su id de Departamento a borrar");
							int idDepartamentoDel = entradanumeros.nextInt();
							GestionEmpleados.borrarDepartamento(idDepartamentoDel);
							break;
						case 11:
							System.out.println(GestionEmpleados.listarDepartamentos());
							break;
						case 12:
							System.out.println("Introduce nombre de Departamento");
							String nombreDepartamentoListar = entradatexto.nextLine();
							System.out.println(GestionEmpleados.listarDepartamentoName(nombreDepartamentoListar));
							break;
						case 13:
							System.out.println("Introduce id de Departamento");
							int idDepartamentoListar = entradanumeros.nextInt();
							System.out.println(GestionEmpleados.listarDepartamentoId(idDepartamentoListar));
							break;
						default:
							System.out.println("**OPCION NO VALIDA**");
						}
					} while (opcion != 0);
		}
}
