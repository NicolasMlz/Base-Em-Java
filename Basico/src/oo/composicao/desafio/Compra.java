package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	
	//Atributos
	final ArrayList<Item> itens = new ArrayList<>();
	
	//Metodos
	double obterValorTotal() {
		
		//Variaveis
		double total=0;
		
		//Calcular total
		for(Item item : itens) {
			total += item.produto.preco*item.qtde;
		}
		
		//Retorno
		return total;
	}
	
	void adicionarItem(Item item) {
		itens.add(item);
	}
}
