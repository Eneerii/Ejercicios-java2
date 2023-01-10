/*Crear una nueva clase de colección para listas de enteros.
Esta nueva clase, a la que llamaremos ListaNumeros, va a heredar ArrayList<integer>.

Sus particularidades son las siguientes:
-Añadirá los siguientes métodos nuevos:
 *first(). Devuelve el primer número de la colección.
 *last(). Devuelve el último número de la colección.
 *sum(). Devuelve la suma de todos los números.
- No permetirá añadir números repetidos.*/
package _03_nueva_clase_lista;

import java.util.ArrayList;

public class ListaNumeros extends ArrayList<Integer>{

	public Integer first(){
		return get(0);		
	}
	public Integer last() {
		return get(size()-1);
	}
	public Integer sum() {
		int suma=0;
		for (int i=0;i<size(); i++) {
			suma=suma+get(i);
		}
		return suma;
		//ahora: No se permitirán números repetidos.

	}
	@Override
	public boolean add(Integer e) {
         if(!contains(e)) {
			return super.add(e);
		}
		return false;

	}
}

