package Practica3;

public class Hotel {
String nombreHotel;
String Descripcion;
String ciudadHotel;
int precioPorNoche,idhotel;

public Hotel() {
	super();
}
public Hotel(String nombreHotel, String descripcion, String ciudadHotel, int precioPorNoche, int idhotel) {
	super();
	this.nombreHotel = nombreHotel;
	Descripcion = descripcion;
	this.ciudadHotel = ciudadHotel;
	this.precioPorNoche = precioPorNoche;
	this.idhotel = idhotel;
}
public String getNombreHotel() {
	return nombreHotel;
}
public void setNombreHotel(String nombreHotel) {
	this.nombreHotel = nombreHotel;
}
public String getDescripcion() {
	return Descripcion;
}
public void setDescripcion(String descripcion) {
	Descripcion = descripcion;
}

public int getIdhotel() {
	return idhotel;
}
public void setIdhotel(int idhotel) {
	this.idhotel = idhotel;
}
public String getCiudadHotel() {
	return ciudadHotel;
}
public void setCiudadHotel(String ciudadHotel) {
	this.ciudadHotel = ciudadHotel;
}
public int getPrecioPorNoche() {
	return precioPorNoche;
}
public void setPrecioPorNoche(int precioPorNoche) {
	this.precioPorNoche = precioPorNoche;
}
@Override
public String toString() {
	return "Hotel [nombreHotel=" + nombreHotel + ", Descripcion=" + Descripcion + ", ciudadHotel=" + ciudadHotel
			+ ", precioPorNoche=" + precioPorNoche + ", idhotel=" + idhotel + "]";
}
}
