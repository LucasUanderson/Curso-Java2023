package lambdas;

public class CalculoTeste {
	
	public static void main(String[] args) {
		
		Soma soma1 = new Soma();
		System.out.println(soma1.executar(5, 10));
		
		Diminuir menos = new Diminuir();
		System.out.println(menos.executar(5, 2));
	}
}
