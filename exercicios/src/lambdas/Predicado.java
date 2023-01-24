package lambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = 
				prod -> (prod.getPreco() * (1 - prod.getDesconto())) >= 750.00;
		
		Produto produto = new Produto("notebook",2300.00, 0.15);
		
		System.out.println(isCaro.test(produto));
	}

}
