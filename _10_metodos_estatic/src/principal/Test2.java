package principal;

interface Printer{
	void print(String cad);
	//incluiremos un método estático que porporcione una determinada implementación de la interfaz
	static Printer of() {
		return new Printer() {
			@Override
			public void print (String cad) {
				System.out.println(cad);
			}
		};
	}
}


public class Test2 {

	public static void main(String[] args) {
		//podemos llamar al método estático de la interfaz para que nos de un objeto ya hecho de una clase que implementa la interfaz, y así no tener que crear una clase que la implemente
		Printer pr=Printer.of();
		pr.print("hello");

	}

}
