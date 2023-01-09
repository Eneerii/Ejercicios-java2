package service;

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
*/

public class Cuenta {
	private double saldo;
    public Cuenta() {
    	saldo=100;
    }
    public Cuenta (double saldo) {
    	this.saldo=saldo;
    }
    //métodos
    
    public void ingresar (double cantidad) {
    	saldo+=cantidad;    	
    }
    
    public void extraer(double cantidad) {
    	saldo-=cantidad;
    } 
    
    public double obtenerSaldo() {
    	return saldo;
    }

    }
