package oo.composicao.herança.desafio;

public class Fusion extends Carro {
	
	Fusion(){
		super(200);
	}

	@Override
	void acelerar() {
		velocidadeAtual += 15;
				
	}

}
