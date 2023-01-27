package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
	
 	public static void main(String[] args) {
		
 		Aluno a1 = new Aluno("Bia", 7.1 );
 		Aluno a10 = new Aluno("Bia", 7.1 );
		Aluno a2 = new Aluno("lc", 7.1 );
		Aluno a3 = new Aluno("bl", 7.3 );
		
		List<Aluno> alunos = Arrays.asList(a1,a10,a2,a3);
			
		System.out.println("distintic...");
		alunos.stream()
			.distinct().forEach(System.out::println);
	}

}
