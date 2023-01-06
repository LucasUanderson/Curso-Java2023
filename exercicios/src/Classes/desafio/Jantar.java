package Classes.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Camarao", 0.800);
		Comida c2 = new Comida("Peixe", 0.200);
		
		Pessoa p1 = new Pessoa("Lucas", 99.8);
		
		System.out.println(p1.apresentar());
		p1.comer(c2);
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
		

	}

}
