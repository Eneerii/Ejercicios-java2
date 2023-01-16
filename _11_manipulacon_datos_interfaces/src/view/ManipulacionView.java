package view;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

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

	}

}