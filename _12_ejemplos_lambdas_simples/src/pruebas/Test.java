package pruebas;
interface I1{
	void print(String cad);
}
interface I2{
	int m (int a, int b);
}
interface I3{
	String send();
	default void call() {
		System.out.println("Hello");
	}
}
public class Test {
	public static void main(String[] args) {
		//expresion lambdas para implementar interfaces
				// las variable son creadas de tipo objeto(I1,I2,I3) que el objeto tiene sus metodos cada uno 
		I1 i1=cad->System.out.println(cad);
		i1.print("prueba lambda");
		I2 i2=(a,b)->a+b; //decido que sumen loa 2 parámetros
		i2.m(3, 6);
		I3 i3=()->"bye";
		i3.send();	
	}

}
