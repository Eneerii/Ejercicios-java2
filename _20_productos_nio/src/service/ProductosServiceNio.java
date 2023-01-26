package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ProductosServiceNio {
	private Path pt=Path.of("C:\\Irene Manana\\fichero\\productos.txt");
	//método que devuelve la lista de productos
	public List<String> listaProductos() {
		try {
			return Files.readAllLines(pt);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	//metodo que a partir del nombre de un producto , nos dice si esta o no almacenado 
	public boolean existeProducto(String producto) {
		try {
			return Files.lines(pt) //Stream<String>
					.anyMatch(s->s.equals(producto));
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	//método que recibe un producto y lo guarda

	public void grabarProducto(String producto) {
		try {
			Files.writeString(pt, producto+System.lineSeparator(), StandardOpenOption.APPEND);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	//método que recibe una lista de productos y la guarda
	public void grabarProductos(List<String> productos) {
		try {		
			Files.write(pt, productos, StandardOpenOption.APPEND);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}



