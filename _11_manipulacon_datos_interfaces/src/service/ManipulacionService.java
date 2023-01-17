package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ManipulacionService {
	public int sumaPares (List<Integer> numeros) {
		int suma=0;
		for(int n:numeros) {
			if(n%2==0) {
			suma+=n;
		}
	}
		return suma;
}
	public int sumaPositivos(List<Integer> numeros) {
		int suma=0;
		for (int n:numeros){
			if(n>0) {
				suma+=n;
			}
		}
		return suma;
	}
	/*Este método servirá para sumar por cualquier criterio la condición que deberá cumplir el número para ser sumado. Se proporciona a través de un objeto que implementa la interfaz Predicate*/
	public int sumaPorCriterio(List<Integer> numeros,Predicate<Integer> condicion) {
		int suma=0;
		for (int n:numeros) {
			if (condicion.test(n)){
				suma+=n;
			}
		}
		return suma;
		
	}
	//método que recibe lista de números y los imprime
	//método que recibe lista de números y los guarda en un fichero
	//método que recibe lista de números y los manda a la nube
	//mediante un único método, aplicamos el procesado que nos manden a casa elemento de la lista 
	
	public void procesaLista(List<Integer> numeros, Consumer<Integer> proceso) {
		
		for (int n:numeros) {
			proceso.accept(n);
		}
	}
	//método que recibe una lista de números e imprime los pares
	//método que recibe un conjunto de números y guarda en un fichero los positivos
	//método que recibe una lista y guarda en un fichero los múltiplos de 5
	//método que recibe un conjunto de números e imprime los negativos
	
	public void procederLista (Collection<Integer> num, Consumer<Integer> proceder, Predicate<Integer> criterio) {
		
		for (Integer n:num) {
			if(criterio.test(n)) {
				proceder.accept(n);
			}
		}
	}
	
	//unmétodo que recibe una lista y devuelve la suma de los cuadrados de los números de la lista
	//un método que recibe una lista y devuelve la suma de las raices cúbicas de los números de la lista
	
	public int sumaTrasformados(Collection<Integer>listado, Function<Integer, Integer> fun) {
		int suma=0;
		for(Integer n:listado) {
			suma+=fun.apply(n);//sumamos el resultado de transformar cada número según la función.
		}
		return suma;
	}
	//método que recibe una lista y devuelve la suma de todos los elementos, a la que le añadimos un valor extraido de un fichero.
	//método que recibe una lista y devuelve la suma de todos los elementos, a la que le añadimos un número leído desde un puerto externo.
	public int sumaListaConValor (Collection<Integer> numeros, Supplier<Integer> data){
        int suma=0;
        for(Integer n:numeros){
        	suma+=n;
        }
        return suma+data.get();
	}
	
	//Método que recibe una lista de cadenas de caracteres y devuelve el total de las vocales de aquellas que comiencen por "a"
	//método que recibe un alista de cadena de caracteres y devuelve el total de caracteres de aquellas que tengan más de 5 letras
	
	public int contarLetras (Collection<String> palabras, Function<String, Integer> fun, Predicate<String> cond) {
		int total=0;
		 for(String cad:palabras) {
			 if (cond.test(cad)) {
				 total+=fun.apply(cad);
			 }
		 }
		 return total;
	}
}
	
	
