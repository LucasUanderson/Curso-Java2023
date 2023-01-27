package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Bia", 7.2 );
		Aluno a2 = new Aluno("lc", 7.2 );
		Aluno a3 = new Aluno("bl", 7.2 );
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3);
		
		Predicate<Aluno> aprovados = a -> a.nota >= 7;
		Function<Aluno, Double> getNota = n -> n.nota;
		BiFunction<Media, Double, Media> calcularMedia = 
				(media, nota) -> media.adicionar(nota); 
				
	    BinaryOperator<Media> combinarMedia = 
	    		(media1, media2)-> Media.combinar(media1, media2);
		
	    		
		alunos.stream()
		.filter(aprovados)
		.map(getNota)
		.reduce(new Media(), calcularMedia, combinarMedia);
		

		
	
	}

}
