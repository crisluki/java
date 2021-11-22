package Practica3;

public class Paquete {
String IdentificadorMarketing;
String fechaInicio;
String fechaFin;
String vueloIda;
String vueloVuelta;
String estanciaHotel;
public Paquete(String identificadorMarketing, String fechaInicio, String fechaFin, String vueloIda, String vueloVuelta,
		String estanciaHotel) {
	super();
	IdentificadorMarketing = identificadorMarketing;
	this.fechaInicio = fechaInicio;
	this.fechaFin = fechaFin;
	this.vueloIda = vueloIda;
	this.vueloVuelta = vueloVuelta;
	this.estanciaHotel = estanciaHotel;
}
public Paquete() {
	super();
}
public String getFechaInicio() {
	return fechaInicio;
}
public void setFechaInicio(String fechaInicio) {
	this.fechaInicio = fechaInicio;
}
public String getFechaFin() {
	return fechaFin;
}
public void setFechaFin(String fechaFin) {
	this.fechaFin = fechaFin;
}
public String getVueloIda() {
	return vueloIda;
}
public void setVueloIda(String vueloIda) {
	this.vueloIda = vueloIda;
}
public String getVueloVuelta() {
	return vueloVuelta;
}
public String getIdentificadorMarketing() {
	return IdentificadorMarketing;
}
public void setIdentificadorMarketing(String identificadorMarketing) {
	IdentificadorMarketing = identificadorMarketing;
}
public void setVueloVuelta(String vueloVuelta) {
	this.vueloVuelta = vueloVuelta;
}
public String getEstanciaHotel() {
	return estanciaHotel;
}
public void setEstanciaHotel(String estanciaHotel) {
	this.estanciaHotel = estanciaHotel;
}
@Override
public String toString() {
	return "Paquete [IdentificadorMarketing=" + IdentificadorMarketing + ", fechaInicio=" + fechaInicio + ", fechaFin="
			+ fechaFin + ", vueloIda=" + vueloIda + ", vueloVuelta=" + vueloVuelta + ", estanciaHotel=" + estanciaHotel
			+ "]";
}
}
