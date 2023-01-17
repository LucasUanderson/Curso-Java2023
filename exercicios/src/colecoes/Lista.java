package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {

		ArrayList<Usuario> lista = new ArrayList<>();

		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Lucas"));
		lista.add(new Usuario("pedro"));
		lista.add(new Usuario("barquinho"));

		// bucando nome pelo o index
		System.out.println(lista.get(2).nome);

		for (Usuario pessoas : lista) {
			System.out.println(pessoas);
		}
		

	}

}
