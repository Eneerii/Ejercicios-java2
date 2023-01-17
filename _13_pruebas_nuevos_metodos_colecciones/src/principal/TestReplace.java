package principal;

import java.util.List;

public class TestReplace {

	public static void main(String[] args) {
		List<Integer> nums=List.of(8,2,5,11,4);
		//reemplazar cada elemento de la lista por su cuadrado
		/*for(int i=0;i<nums.size();i++) {
			nums.set(i, nums.get(i)*nums.get(i));			
		}*/
		//funcional (replaceAll)
		nums.replaceAll(n->n*n);
		//muestro los números (recorro la lista y muestra cada elemento)
		nums.forEach(n->System.out.println(n));

	}

}
