package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = p -> System.out.println(p.getNome() + " ta marcada com minha letra");
	
		Produto p1 = new Produto("Caneta", 12.12,0.09);
		imprimirNome.accept(p1);
		
		Produto p2 = new Produto("Caneta azul", 12.12,0.09);
		Produto p3 = new Produto("Caneta preta", 12.12,0.09);
		Produto p4 = new Produto("Caneta amarron", 12.12,0.09);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.getNome()));
		produtos.forEach(System.out::println);
	}
}
