package PracticaFinal;

public class Medicion  {
int horas , minutos;
float ninos,jovenes,adultos,mayores,todos;
String nombre;
public Medicion(int horas, int minutos, float ninos, float jovenes, float adultos, float mayores, float todos,
		String nombre) {
	super();
	this.horas = horas;
	this.minutos = minutos;
	this.ninos = ninos;
	this.jovenes = jovenes;
	this.adultos = adultos;
	this.mayores = mayores;
	this.todos = todos;
	this.nombre = nombre;
}
public int getHoras() {
	return horas;
}
public void setHoras(int horas) {
	this.horas = horas;
}
public int getMinutos() {
	return minutos;
}
public void setMinutos(int minutos) {
	this.minutos = minutos;
}
public float getNinos() {
	return ninos;
}
public void setNinos(float ninos) {
	this.ninos = ninos;
}
public float getJovenes() {
	return jovenes;
}
public void setJovenes(float jovenes) {
	this.jovenes = jovenes;
}
public float getAdultos() {
	return adultos;
}
public void setAdultos(float adultos) {
	this.adultos = adultos;
}
public float getMayores() {
	return mayores;
}
public void setMayores(float mayores) {
	this.mayores = mayores;
}
public float getTodos() {
	return todos;
}
public void setTodos(float todos) {
	this.todos = todos;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
@Override
public String toString() {
	return "Medicion [horas=" + horas + ", minutos=" + minutos + ", ninos=" + ninos + ", jovenes=" + jovenes
			+ ", adultos=" + adultos + ", mayores=" + mayores + ", todos=" + todos + ", nombre=" + nombre + "]";
}
}