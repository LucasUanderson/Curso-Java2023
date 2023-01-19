package oo.composicao.herança.desafio;

public class Fusion extends Carro implements Esportivo{
	
	Fusion(){
		super(200);
	}

	@Override
	void acelerar() {
		velocidadeAtual += 15;	
	}

	@Override
	public void ligarTurbo() {
		velocidadeAtual += 100;
	}

	@Override
	public void desligarTurbo() {
		velocidadeAtual -= 100;

	}

}
