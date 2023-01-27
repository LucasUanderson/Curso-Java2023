package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("bia",7.2);
		Aluno a2 = new Aluno("lc",7.2);
		Aluno a3 = new Aluno("bl",5.2);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3);
		
		Predicate<Aluno> aprovado = a -> a.nota >=7;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		System.out.println(alunos.stream().allMatch(aprovado));
		System.out.println(alunos.stream().anyMatch(aprovado));
		System.out.println(alunos.stream().noneMatch(reprovado));
	}

}
