package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> adicionam elementos na fila
		
		//a Diferença quando a fila esta cheia
		fila.add("Ana"); // lança uma exceção
		fila.offer("bia"); //retorna false
		
		// Peek  e Element -> obter o proximo elementos da fila 
		// Diferença ocorre quando a fila esta vazia
		
		System.out.println(fila.peek()); //retorna null
		System.out.println(fila.element()); //retorna exceção
		
		//fila.size()
		//fila.clear()
		//fila.isEmpty
		
		// Diferença ocorre quando a fila esta vazia
		System.out.println(fila.poll()); //retorna null
		System.out.println(fila.remove()); //retorna exceção
		
		
		
	
	}

}
