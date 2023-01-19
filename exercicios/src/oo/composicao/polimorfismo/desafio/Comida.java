package oo.composicao.polimorfismo.desafio;

public class Comida {

	 private double peso;

		public Comida(double peso) {
			this.setPeso(peso);
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			if (peso >= 0) {
				this.peso = peso;
			} else {
				System.out.println("Peso precisa ser maior que zero");
			}

		}
}
