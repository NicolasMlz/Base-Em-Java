package collections;

import java.util.HashSet;
import java.util.Set;

public class Baguncado {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		conjunto.add(3);
		conjunto.add(true);
		conjunto.add("Nicolas");

		System.out.println(conjunto.size());
		System.out.println(conjunto.remove(3));
		System.out.println(conjunto.size());
		System.out.println(conjunto.add(3));
		System.out.println(conjunto.size());
		System.out.println(conjunto.contains("Nicolas"));
		System.out.println(conjunto.contains("nicolas"));
		
		Set nums = new HashSet();
		nums.add(4);
		nums.add(false);
		nums.add("Helo");
		nums.add("Nicolas");
		
		//Uniao
		conjunto.addAll(nums);
		System.out.println(conjunto);
		
		//Intersecção
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		//Limpar conjunto
		conjunto.clear();
		System.out.println(conjunto);
	}
}
