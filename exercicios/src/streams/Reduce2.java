package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Bia", 8.5);
		Aluno a2 = new Aluno("lucas", 6.5);
		Aluno a3 = new Aluno("bless", 8.5);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7; // true 
		Function<Aluno, Double> getNota = a -> a.nota;// valor nota
		BinaryOperator<Double>  somatoria = (a, b) -> a + b;
		
		alunos.stream()
			.filter(aprovado)
			.map(getNota)
			.reduce(somatoria)
			.ifPresent(System.out::println);;
			
		
		
	}
}
