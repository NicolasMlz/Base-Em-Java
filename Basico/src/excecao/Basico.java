package excecao;

public class Basico {
	public static void main(String[] args) {
		
//		Aluno a1 = null;
		
		try {
//			System.out.println(a1.nome);
		} catch(Exception e) {
			System.out.println("Ocorreu um erro ao imprimir o nome!");
		}
		try {
			System.out.println(7 / 0);
		} catch(ArithmeticException e) {
			System.out.println("Ocorreu o erro: " + e.getMessage());
		}
		System.out.println("Voce eh mtt bonito!");
	}
	
	public static String imprimirNomeAluno(Aluno a) {
		return a.nome;
	}
}
