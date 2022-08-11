package excecaoPersonalizadaB;

import excecao.Aluno;

public class ValidacaoTeste {
	public static void main(String[] args) {
		
		try {
			Aluno a1 = new Aluno("Nick", -7);
			Validar.aluno(a1);
			
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroNegativoException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.printf("Fim :)\n");
	}
}
