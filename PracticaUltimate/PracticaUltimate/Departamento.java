package PracticaUltimate;

public class Departamento {
int idDepartamento;
String nombre;

public Departamento(int idDepartamento, String nombre) {
	super();
	this.idDepartamento = idDepartamento;
	this.nombre = nombre;
}
public int getIdDepartamento() {
	return idDepartamento;
}
public void setIdDepartamento(int idDepartamento) {
	this.idDepartamento = idDepartamento;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
@Override
public String toString() {
	return "Departamento [idDepartamento=" + idDepartamento + ", nombre=" + nombre+ "]";
}
}
