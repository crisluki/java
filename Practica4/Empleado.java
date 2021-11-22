package Practica4;

public class Empleado {
private int numerosDNI;
private String letraDNI;
private String nombre;
private String apellidos;
private double salario;
public Empleado() {
	super();
}
public Empleado(int numerosDNI, String letraDNI, String nombre, String apellidos, double salario) {
	super();
	this.numerosDNI = numerosDNI;
	this.letraDNI = letraDNI;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.salario = salario;
}
public int getNumerosDNI() {
	return numerosDNI;
}
public void setNumerosDNI(int numerosDNI) {
	this.numerosDNI = numerosDNI;
}
public String getLetraDNI() {
	return letraDNI;
}
public void setLetraDNI(String letraDNI) {
	this.letraDNI = letraDNI;
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
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}
@Override
public String toString() {
	return "Empleado [numerosDNI=" + numerosDNI +  letraDNI + ", nombre=" + nombre + ", apellidos="
			+ apellidos + ", salario=" + salario + "]";
}

}
