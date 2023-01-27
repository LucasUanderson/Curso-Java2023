package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Bia", 7.1);
		Aluno a2 = new Aluno("lc", 7.2);
		Aluno a3 = new Aluno("bl", 7.5);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3);

		Comparator<Aluno> melhorNota = (alu1, alu2) -> {
			if (alu1.nota > alu2.nota)
				return 1;
			if (alu1.nota < alu2.nota)
				return -1;
			return 0;
		};
		
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());

	}

}
