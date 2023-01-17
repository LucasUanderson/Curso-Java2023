package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		/*HashSet não é ordenado
		  Set<String> lista = new HashSet<>();
		*/
		
		//lista ordenada TreeSet
		Set<String> lista = new TreeSet<>();
	
		lista.add("Lucas");
		lista.add("Bia");
		lista.add("Bless");
		lista.add("Pequena");
		
		for(String candidato : lista) {
			System.out.println(candidato);
		}
		
		
		
		Set<Integer> numero = new HashSet<>();
		numero.add(1);
		numero.add(2);
		numero.add(3);
		numero.add(4);
		
		for(Integer n : numero) {
			System.out.println(n);
		}
	}

}
