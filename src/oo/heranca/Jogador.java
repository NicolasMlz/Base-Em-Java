package oo.heranca;

public class Jogador {
	
	//Atributos
	public double vida = 100;
	public int x, y;
	protected double dano=10;
	
	//Metodos
	public boolean atacar(Jogador oponente) {
		
		double deltaX = Math.abs(this.x - oponente.x);
		double deltaY = Math.abs(this.y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= dano;
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= dano;
		}
		
		return true;
	}
	
	
	
	public boolean andar(Direcao direcao) {
		
		if(direcao == Direcao.NORTE) 
			y--;
        else if(direcao == Direcao.LESTE) 
        	x++;
        else if(direcao == Direcao.SUL) 
        	y++;
        else 
        	x--;
		
		return true;
	}
}
