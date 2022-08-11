package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lista {
	public static void main(String[] args) {
		
		//NA PRATICA SÃO OS MESMOS, MAS DIFEREN-SE NA PERFORMANCE
		//2 TIPOS: ARRAYLIST E LINKEDLIST
		
		
		//ARRYLIST => GET E SET MAIS RAPIDOS QUE LINKED
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		lista.add(new Usuario("Nicolas"));
		lista.add(new Usuario("Nicolas"));
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Helo"));
		lista.add(new Usuario("Gueiros"));
		lista.add(new Usuario("Gueiros"));
		for(Usuario u : lista) {
			System.out.println(u.nome);
		}
		System.out.printf("\n");
		
		//LINKEDLIST => ADD E REMOVE MAIS RAPIDOS QUE ARRAYLIST
		LinkedList<Usuario> lista2 = new LinkedList<Usuario>();
		lista2.add(new Usuario("Nicolas"));
		lista2.add(new Usuario("Nicolas"));
		lista2.add(new Usuario("Ana"));
		lista2.add(new Usuario("Helo"));
		lista2.add(new Usuario("Gueiros"));
		lista2.add(new Usuario("Gueiros"));
		for(Usuario u : lista2) {
			System.out.println(u.nome);
		}
		System.out.printf("\n");
	}
}
