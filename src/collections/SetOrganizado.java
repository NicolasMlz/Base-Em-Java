package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class SetOrganizado {
	public static void main(String[] args) {
		
		//HASHSET => MAIS RAPIDO, MAS DESORDENADO
		HashSet<Integer> lista = new HashSet<Integer>();
		lista.add(3);
		lista.add(5);
		lista.add(4);
		lista.add(9);
		lista.add(6);
		lista.add(11);
		lista.add(10);
		lista.add(1);
		lista.add(-22);
		System.out.println(lista);
		
		//LINKEDHASHSET => RESPEITA A ORDEM DE ENTRADA
		LinkedHashSet<Double> lista2 = new LinkedHashSet<Double>();
		lista2.add(3.0);
		lista2.add(5.0);
		lista2.add(4.0);
		lista2.add(8.0);
		lista2.add(5.0);
		System.out.println(lista2);
		
		//TREESET => RESPEITA A ORDEM DOS VALORES, MAS É MAIS LENTO
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(12);
		tree.add(63);
		tree.add(34);
		tree.add(45);
		tree.add(1);
		tree.add(1);
		tree.add(1);
		tree.add(-2);
		System.out.println(tree);
		
		
	}
}
