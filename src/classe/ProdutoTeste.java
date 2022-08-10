package classe;

public class ProdutoTeste {	
	public static void main(String[] args) {
	
		Produto p1 = new Produto("Notebook", 4356.32);
		Produto p2 = new Produto("Mesa", 234.43);
		Produto.desconto = 0.5;
		
		System.out.printf("O valor do produto com desconto é %.2f\n", p1.precoComDesconto());
		System.out.printf("O valor do produto com desconto é %.2f\n", p2.precoComDesconto());
		
		
	}
}
