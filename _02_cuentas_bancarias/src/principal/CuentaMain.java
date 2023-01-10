/*Enunciado ejercicio en clase 
Parte 1:
Crear una clase Cuenta que represente una cuenta bancaria.
La clase tendrá un atributo saldo que represente el saldo de la cuenta y que será inicializado den los constructores.
Habrá tres métodos: ingresar, extraer y obtener Saldo.
Parte 2:
Crear una subclase de Cuenta que incluya un nuevo atributo límite, que servirá para definir el límite máximo de dinero que se podrá extraer.
También incluirá un nuevo método, llamado ajustarLimite(), que se establecerá automáticamente como límite la mitad del saldo existente.
Parte 3:
Se creará una nueva clase que registre los movimientos realizados en la cuenta (ingreso y extracción).
Cada movimiento se caracteriza por una cantidad y un tipo (ingreso o extracción).
Incorporará un nuevo método que devuelva los movimientos registrados
Parte 4:
Hacer la capa de presentación de la aplicación banco.
Al iniciar el programa, se solicita al usuario la introducción de un saldo inicial y un límite. A partir de ahí a parecerá el siguiente menú:
1. Ingresar dinero
2. Extraer dinero
3. Consultar saldo y movimientos
4. Salir
 */
package principal;

import java.util.ArrayList;
import java.util.Scanner;

import model.Movimiento;
import service.CuentaMovimientos;

public class CuentaMain {
	static CuentaMovimientos cuentabanco;
	public static void main(String[] args) {
		double saldo, limite;
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce saldo:");
		saldo=Double.parseDouble(sc.nextLine());
		System.out.println("Introduce limite");
		limite=Double.parseDouble(sc.nextLine());
		cuentabanco=new CuentaMovimientos(saldo, limite);

		int opcion;
		do {
			mostrarMenu();
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				ingresar();
				break;
			case 2:
				extraer();
				break;
			case 3:
				consultaMovimientos();
				break;
			case 4:
				System.out.println("...Adios...");
			}
		}while(opcion!=4);


	}
	static void mostrarMenu() {
		System.out.println("1.- Ingresar dinero");
		System.out.println("2.- Sacar dinero");
		System.out.println("3.- Consultar saldo y movimientos");
		System.out.println("4.- Salir");
	}

	static void ingresar() {
		Scanner sc=new Scanner(System.in);
		double cantidad;
		System.out.println("Introduce cantidad a ingresar");
		cantidad=Double.parseDouble(sc.nextLine());
		cuentabanco.ingresar(cantidad);


	}
	static void extraer() {
		Scanner sc=new Scanner(System.in);
		double cantidad;
		System.out.println("Introduce cantidad a extraer");
		cantidad=Double.parseDouble(sc.nextLine());
		cuentabanco.extraer(cantidad);

	}
	static void consultaMovimientos() {
		ArrayList<Movimiento> movs=cuentabanco.obtenerMovimiento();
		for(Movimiento m:movs) {
			System.out.println(m.getTipo()+":"+m.getCantidad());
		}
		System.out.println("Saldo final:" +cuentabanco.obtenerSaldo());

	}
}
