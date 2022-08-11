package generics;

public class CaixaIntTeste {
	public static void main(String[] args) {
		CaixaInt cA = new CaixaInt();
		cA.guardar(30);
		System.out.println(cA.abrir());
	}
}
