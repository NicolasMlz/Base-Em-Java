package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Map {
	public static void main(String[] args) {
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda\n");
		marcas.stream().map(m -> m.toUpperCase()).forEach(Utilitarios.print);;
		
		//Funcoes
		UnaryOperator<String> maiuscula = s -> s.toUpperCase();
		UnaryOperator<String> primeiraLetra = s -> s.charAt(0) + "";
		UnaryOperator<String> berro = s -> s + "!!! ";
		
		//NOVO MODO DE ALTERAR A LISTA
		marcas.stream()
			.map(maiuscula)
			.map(primeiraLetra)
			.map(berro)
			.forEach(Utilitarios.print);
	}
}
