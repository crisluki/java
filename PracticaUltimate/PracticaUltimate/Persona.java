package PracticaUltimate;

public class Persona {
int iD;
String dNI;
String nombre;
String apellidos;
float salario;
boolean generoMposFneg;
int iDDepartamento;

public Persona(int iD, String dNI, String nombre, String apellidos, float salario, boolean generoMposFneg,
		int iDDepartamento) {
	super();
	this.iD = iD;
	this.dNI = dNI;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.salario = salario;
	this.generoMposFneg = generoMposFneg;
	this.iDDepartamento = iDDepartamento;
}
public int getiD() {
	return iD;
}
public void setiD(int iD) {
	this.iD = iD;
}
public String getdNI() {
	return dNI;
}
public void setdNI(String dNI) {
	this.dNI = dNI;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public float getSalario() {
	return salario;
}
public void setSalario(float salario) {
	this.salario = salario;
}
public boolean isGeneroMposFneg() {
	return generoMposFneg;
}
public void setGeneroMposFneg(boolean generoMposFneg) {
	this.generoMposFneg = generoMposFneg;
}
public int getiDDepartamento() {
	return iDDepartamento;
}
public void setiDDepartamento(int iDDepartamento) {
	this.iDDepartamento = iDDepartamento;
}
@Override
public String toString() {
	return "Persona [iD=" + iD + ", dNI=" + dNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario="
			+ salario + ", generoMposFneg=" + generoMposFneg + ", iDDepartamento=" + iDDepartamento + "]";
}
}
