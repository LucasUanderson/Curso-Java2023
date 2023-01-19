package oo.composicao.polimorfismo.desafio;

public class JantarTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(55.0);
		
		Arroz arroz1 = new Arroz(2.2);
		Feijao feijao = new Feijao(2.2);
		Sorvete sorvete = new Sorvete(2.2);
		
		
		System.out.println(p1.getPeso());
		
		p1.comer(arroz1);
		p1.comer(feijao);
		p1.comer(sorvete);
		
		System.out.println(p1.getPeso());
		
	}

}
