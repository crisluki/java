package Prueba1;
import java.sql.*;

public class Ejercicio3Conectores {
	static String usuario,password;
	public static String recursivo(int num, String nifBusqueda, float salarioBusqueda){
		String texto="";
	try {// cargar el Driver
		Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/empresa", usuario, password);
		// Preparamos la consulta
		Statement sentencia = conexion.createStatement();
		String sql = "Select * from empleados";
		ResultSet resultado = sentencia.executeQuery(sql);
		switch (num) {
		case 1:
			while (resultado.next()) {
				String NIF = resultado.getString("NIF");
				String Nombre = resultado.getString("Nombre");
				String Apellidos = resultado.getString("Apellidos");
				Float Salario = resultado.getFloat("Salario");
				texto +="NIF->"+NIF+"\n"+
						"Nombre->"+Nombre+"\n"+
						"Apellidos->"+Apellidos+"\n"+
						"Salario->"+Salario+"\n";			
			}
		case 2:
			while (resultado.next()) {
				String nif = resultado.getString("NIF");
				if(nif.equals(nifBusqueda)) {
					String NIF = resultado.getString("NIF");
					String Nombre = resultado.getString("Nombre");
					String Apellidos = resultado.getString("Apellidos");
					Float Salario = resultado.getFloat("Salario");
					texto +="NIF->"+NIF+"\n"+
							"Nombre->"+Nombre+"\n"+
							"Apellidos->"+Apellidos+"\n"+
							"Salario->"+Salario+"\n";
				}
			}
		case 3:
			while (resultado.next()) {
				Float salario = resultado.getFloat("Salario");
				if(salario > salarioBusqueda) {
					String NIF = resultado.getString("NIF");
					String Nombre = resultado.getString("Nombre");
					String Apellidos = resultado.getString("Apellidos");
					Float Salario = resultado.getFloat("Salario");
					texto +="NIF->"+NIF+"\n"+
							"Nombre->"+Nombre+"\n"+
							"Apellidos->"+Apellidos+"\n"+
							"Salario->"+Salario+"\n";
				}
			}
		case 4:
			while (resultado.next()) {
				Float salario = resultado.getFloat("Salario");
				if(salario <= salarioBusqueda) {
					String NIF = resultado.getString("NIF");
					String Nombre = resultado.getString("Nombre");
					String Apellidos = resultado.getString("Apellidos");
					Float Salario = resultado.getFloat("Salario");
					texto +="NIF->"+NIF+"\n"+
							"Nombre->"+Nombre+"\n"+
							"Apellidos->"+Apellidos+"\n"+
							"Salario->"+Salario+"\n";
				}
			}
		}
		// Liberamos los recursos
		resultado.close();
		sentencia.close();
		//conexion.close();
		return texto;
	} catch (SQLException e) {
		 e.printStackTrace();
	}
	return "No hubo coincidencias";
	}
	public static String listarEmpleados() {
		return recursivo(1,"",0);
	}
	public static String nifEmpleado(String nifBusqueda) {
		return recursivo(2,nifBusqueda,0);
	}
	public static String salarioEmpleado(float salarioBusqueda) {	
		return recursivo(3,"",salarioBusqueda);
	}
	public static String salario2Empleado(float salario2Busqueda) {
		return recursivo(4,"",salario2Busqueda);
	}
	public static void registro(String user, String pass) {
		usuario = user;
		password = pass;
	}
}