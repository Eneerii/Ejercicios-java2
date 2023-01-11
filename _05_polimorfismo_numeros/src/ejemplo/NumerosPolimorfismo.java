package ejemplo;

public class NumerosPolimorfismo {
	public static void main (String[] args) {
		mostrarEntero(34.8);
		mostrarEntero(10);
		mostrarEntero(4L);
	}
	
	public static void mostrarEntero(Number n) {
		System.out.println(n.intValue());
	}

}
