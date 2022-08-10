package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		//Instancias
		Data nascimento = new Data(18, 5, 2003);
		Data hoje = new Data(23, 6, 2022);
		Data padrao = new Data();
		
		//Saida
		System.out.printf("Seu nascimento aconteceu em %s.\n", nascimento.obterDataFormatada());
		System.out.printf("Hoje é %s.\n", hoje.obterDataFormatada());
		System.out.printf("A data padrão é %s.\n", padrao.obterDataFormatada());
	}
	
}
