package service;
/*Enunciado ejercicio en clase 
Parte 1:
Crear una clase Cuenta que represente una cuenta bancaria.
La clase tendrá un atributo saldo que represente el saldo de la cuenta y que será inicializado den los constructores.
Habrá tres métodos: ingresar, extraer y obtener Saldo.
Parte 2:
Crear una subclase de Cuenta que incluya un nuevo atributo límite, que servirá para definir el límite máximo de dinero que se podrá extraer.
También incluirá un nuevo método, llamado ajustarLimite(), que se establecerá automáticamentecomo límite la mitad del saldo existente.
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
public class CuentaLimite extends Cuenta {
	private double limite;
	public CuentaLimite (double saldo, double limite) {
		super(saldo);
		this .limite=limite;	
	}
	public CuentaLimite() {
		this.limite=50;
	}
	public void ajustarLimite(double limite) {
		limite=obtenerSaldo()/2;

	}
	//sobreescritura de extraer
	@Override
	public void extraer(double cantidad) {
		if(cantidad<=limite) {
			super.extraer(cantidad); //llama al extraer de la superclase
		}else {
			super.extraer (limite); // si quiere extraer más, el límite solo te permite el límite
		}

	}
}