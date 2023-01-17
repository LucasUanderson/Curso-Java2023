package oo.composicao;

public class Carro {
	
	//instancia da classe Motor 
	Motor motor = new Motor();
	
	//metodo sem retorno
	void acelerar () {
		motor.fatorInjeção += 0.4;
	}
	void frear () {
		motor.fatorInjeção -= 0.4;
	}
	
	void ligar () {
		 motor.ligado = true;
	}
	
	void desligado() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}

}
