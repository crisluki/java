package Prueba1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio2 {
	public static void main(String[] args) {
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "admin");
			Statement st = conexion.createStatement();
			st.executeUpdate("CREATE TABLE `contacto` (`id` INT AUTO_INCREMENT,`nombre` VARCHAR(20),`apellidos` VARCHAR(20), `telefono` VARCHAR(20),PRIMARY KEY(`id`))");
			//st.executeUpdate("DROP TABLE contacto");
			String nombres[]={"Cristian","Borja","Alvaro"};
			String apellidos[]={"Gomez","Lopez","Alvarez"};
			String telefonos[]={"123","456","789"};
			for (int i=0;i<nombres.length;i++) {
				   st.executeUpdate("INSERT INTO contacto (nombre, apellidos, telefono) VALUES ('"+nombres[i]+"','"+apellidos[i]+"','"+telefonos[i]+"' )");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
