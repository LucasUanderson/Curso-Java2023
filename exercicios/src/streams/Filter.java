package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("lucas", 7.9);
		Aluno a2 = new Aluno("bia", 7.8);
		Aluno a3 = new Aluno("chris", 7.12);
		Aluno a4 = new Aluno("joao", 7.66);
		Aluno a5 = new Aluno("jorge", 7.50);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);
		
		//Represents a predicate (boolean-valued function) of one argument.
		Predicate<Aluno> estaAprovado = a -> a.nota >=7;
		
		
		//Represents a function that accepts one argument and produces a result.
		Function<Aluno, String> saudacaoAprovado =
				a -> "parabens " + a.nome + "! voce foi aprovado";
		
		alunos.stream()
		    .filter(estaAprovado)
		    .map(saudacaoAprovado)
		    .forEach(System.out::println);
		}
	}

