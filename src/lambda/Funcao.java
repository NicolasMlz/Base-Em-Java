package lambda;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "par" : "impar";
		
		Function<String, String> oResultadoE = 
				valor -> "O resultado é: " + valor ;
				
		Function<String, String> empolgado = 
				valor -> valor + "!!!" ;
				
		Function<Void, String> legal = 
				(Void) -> "Legal";
		
		String resultado = 
				parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(33);
		
		System.out.println(resultado);
		System.out.println(legal.apply(null));
	}
}
