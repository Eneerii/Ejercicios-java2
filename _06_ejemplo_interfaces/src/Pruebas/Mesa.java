package Pruebas;

import interfaces.Operaciones;

public class Mesa implements Operaciones{
    private int largo, ancho, alto;

	public Mesa(int largo, int ancho, int alto) {
		super(); //el asistente lo pone siempre, aunque no estés heredando nada. Se puede quitar o no, porque ninguna afecta.
		this.largo = largo;
		this.ancho = ancho;
		this.alto = alto;
	}

	@Override
	public void girar(int a) {
		largo+=a;
		ancho+=a;
		
	}

	@Override
	public int invertir() {
		alto*=(-1);
		return alto;
	}
    
}
