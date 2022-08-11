package lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	public static void main(String[] args) {
		
		
		//MODO 1
		BinaryOperator<Double> media =
				(n1, n2) -> (n1+n2)/2;
		Function<Double, String> conceito =
				m -> m >= 6 ? "Aprovado!" : "Reprovado!";
		
		//MODO 2
		BiFunction<Double, Double, String> status = (n1, n2) -> {
			return media.apply(n1, n2) >= 6 ?
					"Aprovado!" : "Reprovado!";
		};
		
		System.out.println(status.apply(8.0, 4.0));
		System.out.println(media.andThen(conceito).apply(8.0, 4.0));
	}
}
