package oo.composicao;

public class Motor {
     
	//atributos
	double fatorInjeção = 1;
	boolean ligado = false;
     
	//metodo
	int giros() {
		// controle para saber de carro esta ligado
		if (!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorInjeção * 3000);
		}

	}

}
