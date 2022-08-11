package generics;

public class CaixaTeste {
	public static void main(String[] args) {
		
		Caixa<String> cA = new Caixa<>();
		cA.guardar("Segredo.");
		System.out.println(cA.abrir());
		
		Caixa<Integer> cB = new Caixa<>();
		cB.guardar(10);
		System.out.println(cB.abrir());
	}
}
