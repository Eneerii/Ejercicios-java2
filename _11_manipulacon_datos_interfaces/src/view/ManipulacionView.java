package view;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

import service.ManipulacionService;

public class ManipulacionView {

	public static void main(String[] args) {
		List<Integer> nums=List.of(3,8,2,11,4,9);
		ManipulacionService service=new ManipulacionService();
		//mostrar suma de los pares por un lado, y suma de los positivos por otro
		/*Predicate<Integer> condicion=new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t%2==0; //devuelve true si es par
			}
		};
		System.out.println("Suma pares: "+service.sumaPorCriterio(nums,condicion));
		service.sumaPorCriterio(nums, new Predicate<Integer>() {
		
		@Override
		public boolean test(Integer t) {
			
			return t%2==0; //devuelve true si es par
		}
	});
	//los positivos
		
		//los positivos
		System.out.println("Suma positivos: "+service.sumaPorCriterio(nums,new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t>0; //devuelve true si positivo
			}
		}));*/
		/*Predicate<Integer> condicionPar=t->t%2==0; //implementaciones de Predicate para pares
		Predicate<Integer> condicionPositivo= i->i>0; //implementaciones de Predicate para positivos
		System.out.println("Suma pares: "+service.sumaPorCriterio(nums, condicionPar));
		System.out.println("Suma positivos: "+service.sumaPorCriterio(nums,condicionPositivo));*/
		//más reducido
		System.out.println("Suma pares: "+service.sumaPorCriterio(nums, t->t%2==0));
		System.out.println("Suma positivos: "+service.sumaPorCriterio(nums,i->i>0));
		
		//imprime los numeros de la lista:
		
		service.procesaLista(nums, x-> System.out.println(x));
		
		//imprime los pares de la lista
		service.procederLista(nums, x->System.out.println(x), x->x%2==0);
		
		//guarda en fichero los positivos de la lista
		
		service.procederLista(nums, x->{
			String ruta="c:\\temp\\lambda.txt";
			try(FileOutputStream fos=new FileOutputStream(ruta,true);
					PrintStream out=new PrintStream(fos);){
				out.println(x);
			}
				catch(IOException ex) {
					ex.printStackTrace();
		}
		},
		 x->x>0);
		//suma de los cuadrados de la lista
		System.out.println(service.sumaTrasformados(nums,n->n*n));
		
		//suma de los cuadrados de las raices
		UnaryOperator<Integer> f1=a->a*a;
		UnaryOperator<Integer> f2= a->(int)Math.pow(a,  1/3);
		System.out.println(service.sumaTrasformados(nums,f1.andThen(f2)));
		
		//suma de los elementos de la lista más un número aleatorio(entre1 y 100)
		System.out.println(service.sumaListaConValor(nums, ()->(int)(Math.random()*100+1)));
		
		List<String> cadenas=List.of("salida", "armario", "luna", "amarillo");
		//total de vocales de las que empiezan por a
		System.out.println(service.contarLetras(cadenas, c->{
			int vocales=0;
			for(int i=0;i<c.length();i++) {
				switch(c.charAt(i)) {
				case 'a','e','i','o','u':
					vocales++;
				}
			}
			return vocales;
		}, c->c.startsWith("a")));
	}

}