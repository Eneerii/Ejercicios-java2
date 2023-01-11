package principal;

import Pruebas.Mesa;
import Pruebas.Punto3D;
import interfaces.Operaciones;

//polimorfismo con interfaces
public class Test {

	public static void main(String[] args) {
		Operaciones op;
		procesar(new Mesa(2,7,3));

		procesar(new Punto3D(1,6,2));


	}

	static void procesar(Operaciones op) {
		op.girar(10);
		System.out.println(op.invertir());
	}

}