package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		//Instancias
		Queue<String> fila = new ArrayDeque<>();
		
		//Ambos adicionam, mas se diferenciam quando a lista esta cheia
		fila.add("Nick");
		fila.offer("Helo"); //Retorna false quando a lista esta cheia
		fila.add("Du"); //Retorna erro quando a lista esta cheia
		fila.offer("Thigas");
		fila.add("Borba");
		
		//Ambos selecionam o primeiro elemento e nao o removem,
		//mas se diferenciam quando a lista esta vazia
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println("\n");
		
		//Ambos selecionam e removem o elemento,
		//mas se diferenciam quando a fila esta vazia
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
	}
}
