package model;
/*1.-Añadir producto
2.-Subir precio
3.-Ordenar productos
4.-Eliminar productos
5.-Mostrar productos
6.-Salir

Cada producto se identifica por:
nombre, precio, categoria

opcion1: Se piden los datos del producto y se añade
opcion2: se pide un porcentaje, y se sube en ese porcentaje al precio 
de todos los productos
opcion3: se ordenan los productos por precio, de menor a mayor
opcion4: se pide una categoría y se eliminan los productos de dicha categoría
opcion5: se muestran los datos de todos los productos almacenados*/
public class ProductosModel {
	double precio;
	String producto;
	String categoria;
	public ProductosModel(int precio, String nombre, String categoria) {
		super();
		this.precio = precio;
		this.producto = nombre;
		this.categoria = categoria;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return producto;
	}
	public void setNombre(String nombre) {
		this.producto = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
