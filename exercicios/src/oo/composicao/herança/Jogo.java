package oo.composicao.herança;

public class Jogo {

	public static void main(String[] args) {
		
		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 10;
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 11;
		
		
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		System.out.println("Monstro tem " + monstro.vida + "% de vida");
		System.out.println("Heroi tem " + heroi.vida + "% de vida");
		

	}

}
