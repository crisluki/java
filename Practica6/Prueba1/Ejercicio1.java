package Prueba1;
import java.sql.*;

public class Ejercicio1 {

	public static void main(String[] args) { // cargar el Driver

		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "admin");
			
			// Preparamos la consulta
			Statement sentencia = conexion.createStatement();
			String sql = "Select * from empleados";
			ResultSet resultado = sentencia.executeQuery(sql);

			// Recorremos el resultSet obteniendo su contenido.
			while (resultado.next()) {
				String NIF = resultado.getString("NIF");
				String Nombre = resultado.getString("Nombre");
				String Apellidos = resultado.getString("Apellidos");
				Float Salario = resultado.getFloat("Salario");
				System.out.println("NIF->"+NIF+"\n"+
								   "Nombre->"+Nombre+"\n"+
								   "Apellidos->"+Apellidos+"\n"+
								   "Salario->"+Salario+"\n");			
			}
			// Liberamos los recursos
			resultado.close();
			sentencia.close();
			//conexion.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
