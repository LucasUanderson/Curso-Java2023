package colecoes;

import java.util.HashSet;
import java.util.Set;

public class Hash {

	public static void main(String[] args) {
     
		Set<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("pedro"));
		usuarios.add(new Usuario("ana"));
		usuarios.add(new Usuario("bless"));
		
		System.out.println(usuarios.contains(new Usuario("bless")));
	}

}
