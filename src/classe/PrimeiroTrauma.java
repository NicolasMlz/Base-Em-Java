package classe;

public class PrimeiroTrauma {
	
	int a = 3;
	
	public static void main(String[] args) {
		
		/* Sem a cria��o de uma inst�ncia do tipo PrimeiroTrauma
		 * n�o � poss�vel  acessar o atributo "a" por um modo est�tico.
		 * Outra forma poss�vel seria decalar "a", como uma vari�vel da classe,
		 * de modo est�tica. Assim ficaria "static int a = 3", podendo ser
		 * acessada a partir da classe e n�o de um objeto */
		
		//Criar instancia dessa classe
		PrimeiroTrauma p = new PrimeiroTrauma();
		
		//Saida usando a variavel a
		System.out.println(p.a);
	}
}
