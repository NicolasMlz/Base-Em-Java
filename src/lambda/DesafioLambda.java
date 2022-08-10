package lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;


public class DesafioLambda {
	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		Function<Produto, Double> precoReal =
				produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> imposto = 
				x -> x >= 2500 ? (x * 1.085) : x;
		UnaryOperator<Double> frete = 
				x -> x > 3000 ? (x + 100) : (x + 30);
		UnaryOperator<Double> arredondar = 
				x -> Double.parseDouble(String.format("%.2f", x));

		Function<Double, String> formatar =
				x -> ("R$" + x).replace('.', ',');
		
		Double valorTotal = precoReal
				.andThen(imposto)
				.andThen(frete)
				.andThen(arredondar)
				.apply(p);
		
		System.out.println("O preço é: " + formatar.apply(valorTotal));
	}
}
