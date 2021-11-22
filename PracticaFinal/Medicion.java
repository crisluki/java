package PracticaFinal;

import java.io.Serializable;

public class Medicion implements Serializable {
int horas;
int minutos;
String nombre;
int []audiencia_seg=new int[4];
public Medicion(int horas, int minutos, String nombre,int[]audiencia_seg)
{ this.horas = horas;
this.minutos = minutos;
this.nombre = nombre;
this.audiencia_seg=audiencia_seg;
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
public String getNombre() {
return nombre;
}
public void setNombre(String nombre) {
this.nombre = nombre;
}
public int[] getAudiencia_seg() {
return audiencia_seg;
}
public void setAudiencia_seg(int[] audiencia_seg) {
this.audiencia_seg = audiencia_seg;
}
}