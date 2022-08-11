package oo.heranca;

public class Heroi extends Jogador{
	
	//Metodos
	public boolean atacar(Jogador oponente) {
		
		this.dano = 15;
		boolean ataque1 = super.atacar(oponente);
		
		return ataque1;
	}
}
