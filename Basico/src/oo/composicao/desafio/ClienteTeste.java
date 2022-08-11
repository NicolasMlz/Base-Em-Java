package oo.composicao.desafio;

public class ClienteTeste {
	public static void main(String[] args) {
		
		//Instancias
		Produto produto1 = new Produto("Caderno", 5.00);
		Produto produto2 = new Produto("Mochila", 150.00);
		Produto produto3 = new Produto("Estojo", 15.00);
		Cliente c1 = new Cliente();
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		Item item1 = new Item(3, produto1);
		Item item2 = new Item(4, produto2);
		Item item3 = new Item(4, produto3);
		Item item4 = new Item(1, produto1);
		
		//Compras
		compra1.adicionarItem(item1);
		compra1.adicionarItem(item2);
		compra2.adicionarItem(item3);
		compra2.adicionarItem(item4);
		
		//Cliente
		c1.adicionarCompra(compra1);
		c1.adicionarCompra(compra2);
		
		//Saida
		System.out.printf("O valor total da sua compra é de R$%.2f.\n",
				c1.obterValorTotal());
	}
}
