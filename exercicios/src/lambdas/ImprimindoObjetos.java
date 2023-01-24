package lambdas;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana","Bia","Lu");
		
		System.out.println("Usando o foreach...");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando Interator ");
		Iterator<String> iterato = aprovados.iterator();
		while(iterato.hasNext()) {
			System.out.println(iterato.next());
		}
		
		
		System.out.println("\nUsando Stream... ");
		Stream<String> strem = aprovados.stream();
		strem.forEach(System.out::println);
	}
}
