
package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductosServiceIo {
	private String ruta="c:\\ficheros\\productos.txt";
	//método que devuelve la lista de productos
	public List<String> listaProductos() {
		List<String> resultado=new ArrayList<>();
		try(FileReader fr=new FileReader(ruta);
				BufferedReader bf=new BufferedReader(fr);){
			String s;
			while((s=bf.readLine())!=null) {
				resultado.add(s);
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return resultado;
	}
	
	//método que a partir del numbre de un producto, nos dice
	//si está o no almacenado
	public boolean existeProducto(String producto) {
		try(FileReader fr=new FileReader(ruta);
				BufferedReader bf=new BufferedReader(fr);){
			String s;
			while((s=bf.readLine())!=null) {
				if(s.equals(producto)) {  //encontrado
					return true;
				}
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return false;
	}
	
}
