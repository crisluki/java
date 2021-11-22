package Practica1;

import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
public class Eje6SacarRutaPorJlist {
	public static void main(String[] args) {
		String ruta = "C:\\Users\\crisluki\\eclipse-workspace\\AD\\1Trimestre\\AD";
		File f = new File(ruta);
		String[] listFiles= f.list();
		ArrayList<Object> lista = new ArrayList<Object>();
		if(f.exists()){
			System.out.println("Buscando archivos de AD");
			for(String file: listFiles){
				lista.add(file);
				System.out.println(file);
			}
			DefaultListModel<Object> listModel = new DefaultListModel<Object>();
			for(int i=0; i<lista.size(); i++) {
				listModel.add(i, lista.get(i));
			}
			JList<Object> jList = new JList<Object>();
			jList.setModel(listModel);
			jList.setVisible(true);
		}else {
			System.out.println("El archivo no existe");
		}
}
}
