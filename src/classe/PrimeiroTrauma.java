package classe;

public class PrimeiroTrauma {
	
	int a = 3;
	
	public static void main(String[] args) {
		
		/* Sem a criação de uma instância do tipo PrimeiroTrauma
		 * não é possível  acessar o atributo "a" por um modo estático.
		 * Outra forma possível seria decalar "a", como uma variável da classe,
		 * de modo estática. Assim ficaria "static int a = 3", podendo ser
		 * acessada a partir da classe e não de um objeto */
		
		//Criar instancia dessa classe
		PrimeiroTrauma p = new PrimeiroTrauma();
		
		//Saida usando a variavel a
		System.out.println(p.a);
	}
}
