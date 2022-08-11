package streams.reduce;

import java.util.Arrays;
import java.util.List;

public class Reduce1 {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		int i = nums.stream().reduce(100, (ac, n) -> ac + n);
		System.out.println(i);
		
		nums.stream()
			.filter(n -> n > 5)
			.reduce((a, n) -> a + n)
			.ifPresent(System.out::println);
			
	}
}
