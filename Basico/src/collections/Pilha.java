package collections;

import java.util.Deque;
import java.util.LinkedList;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<Double> notas = new LinkedList<Double>();
		
		//Adicionar
		notas.push(3.0);
		notas.push(8.5); 
		notas.push(4.5);
		notas.push(9.0);
		notas.push(9.0);
		
		//Acessar
		System.out.println(notas.peek());
		System.out.println(notas.element());
		System.out.println(notas.peek());
		System.out.printf("\n");
		
		//Acessar e remover
		System.out.println(notas.pop());
		System.out.println(notas.poll());
		System.out.println(notas.pop());
		System.out.println(notas.poll());
		
		//Metodos gerais
//		notas.size();
//		notas.clear();
//		notas.contains(...);
//		notas.addAll(...);
	}
}
