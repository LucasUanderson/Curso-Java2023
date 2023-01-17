package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// HashSET nao aceita repetição

		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // vai converter double para wrapper Double
		conjunto.add(true); // vai converter boolean para wrapper Boolean
		conjunto.add("teste"); // String
		conjunto.add(1); // vai converter int para wrapper Interger
		conjunto.add('x'); // vai converter char para wrapper Character

		System.out.println("tamanho " + conjunto.size());

		// remove dados do conjunto
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove('x'));

		System.out.println("tamanho " + conjunto.size());
        
		// pesquisa se contem o resultado no conjunto
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains('x'));
		
		
		HashSet numero = new HashSet();
		
		numero.add(1);
		numero.add(2);
		numero.add(3);
		
		System.out.println(numero);
		System.out.println(conjunto);
		
		// uniao entre dois conjuntos 
		//conjunto.addAll(numero);
		
		
		System.out.println(conjunto);
		
		
		
		
		
		
		

	}
}
