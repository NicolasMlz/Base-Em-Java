package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
	
	//Atributos
	ArrayList<Compra> compras = new ArrayList<>();
	String nome;
	
	//Metodos
	double obterValorTotal() {
		
		//Variaveis
		double total=0;
		
		//Calcular total
		for(Compra compra : compras) {
			total += compra.obterValorTotal();
		}
		
		//Retorno
		return total;
	}
	
	void adicionarCompra(Compra compra) {
		compras.add(compra);
	}
}