package Practica2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Eje2GuardaPersonaHasta0 {
static File f;

public static void pedirdatos() {
boolean salida = false;
Scanner entrada = new Scanner(System.in);
try {
String ruta = "C:\\Users\\crisluki\\eclipse-workspace\\AD\\PrimerTrimestre";
String nombreFichero = "Fichero.txt";
f = new File(ruta,nombreFichero);
if(!f.exists()) {f.createNewFile();}
BufferedWriter Fichero = new BufferedWriter(new FileWriter(f));
System.out.println("Generando serie de numeros, acaba introduciendo '0'");
while(!salida) {
System.out.println("Introduce un numero: ");
int entradaNumero= entrada.nextInt();
if(entradaNumero > 0) {
Fichero.write(Integer.toString(entradaNumero));
Fichero.newLine();
}else {
Fichero.close();
salida = true;
}
}
Fichero.close();

}catch (Exception e) {
}
entrada.close();
}
public static int LeerFichero() {
int suma=0;
try {
BufferedReader Fichero = new BufferedReader(new FileReader(f));
String linea = "";

while((linea=Fichero.readLine())!=null) {
suma = suma+Integer.valueOf(linea);
}
Fichero.close();
}catch (Exception e) {
return -1;
}
return suma;

}
}

