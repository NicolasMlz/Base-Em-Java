package streams;

import java.util.function.Consumer;


public class Utilitarios {
	
	private Utilitarios() {}
	
	public final static Consumer<Object> print =
			System.out::println;
	
	public final static String inteiroParaBinario(int i) {
		return Integer.toBinaryString(i);
	}
	
	public final static String inverterString(String n) {
		return new StringBuilder(n).reverse().toString();
	}
			
	public final static Integer binarioParaInteiro (String b) {
		return Integer.parseInt(b, 2);
	}

}
