package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Long, String> usuario = new HashMap<Long, String>();
		usuario.put((long) 1, "lucas");
		usuario.put((long) 2, "bia");
		
		//Tamanho do map
		System.out.println(usuario.size());
		// esta vazio?
		System.out.println(usuario.isEmpty());
		//quantas chaves existem
		System.out.println(usuario.keySet());
		// quais valores
		System.out.println(usuario.values());
		// amostra chave e valor
		System.out.println(usuario.entrySet());
		// Pesquisa se a chave existe e retorna um boolean		
		//System.out.println(usuario.containsKey(1));
		// Pesquisa se o valor existe e retorna um boolean	
		System.out.println(usuario.containsValue("lucas"));
		// pega a chave  e retorna o valor que esta na chave	
		//System.out.println(usuario.get(1));
             
		     //foreach por chave
			for(long usuarios: usuario.keySet()) {
				System.out.println(usuarios);
			}
			 //foreach por valor
			for (String valor:usuario.values() ) {
				System.out.println(valor);
			}
			 //foreach para chave e valor
			for(Entry<Long, String> registro : usuario.entrySet() ) {
				System.out.println(registro.getKey());
				System.out.println(registro.getValue());
			}
			
			
	}

}
