package lambda;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = (prod) -> {
			return (prod.preco * (1 - prod.desconto)) >= 750;
		};
		Produto produto = new Produto("Notebook", 2000.00, 0.15);
		System.out.println(isCaro.test(produto));
		
	
	}
}
