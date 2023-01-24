package principal;

import java.util.List;
import java.util.stream.Collectors;

public class Test11OtrosCollect {
	public static void main(String[] args) {
		List<Integer> nums=List.of(6,2,5,1,3,22);
		System.out.println(
				nums.stream()
				.mapToInt(n->n) //Stream<Integer>
				.sum() 
				);
		
		//utilizando collect
		System.out.println(
				nums.stream()
				.collect(Collectors.summingInt(n->n))
				);
	}

}
