package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioSteam {
	
	public static void main(String[] args) {
		
		Produtos prod1 = new Produtos("radio",1900,0.40,true);
		Produtos prod2 = new Produtos("notebbok",1900,0.30, true);
		Produtos prod3 = new Produtos("panela",1900,0.10, true);
		
		
		List<Produtos> alunos = Arrays.asList(prod1,prod2,prod3);
		
		//Represents a predicate (boolean-valued function) of one argument.
		Predicate<Produtos> freteEDesconto = p -> p.getDesconto() >= 0.3 && p.getFrete() == true;
		Function<Produtos, String> saudacao = s -> "Aproveite! Produtos com 30% de desconto e frete gratis: \n" + s.getNome() + " Por R$"+s.getPreco(); 
		
		alunos.stream()
			.filter(freteEDesconto)
			.map(saudacao)
			.forEach(System.out::println);
		
		
      
	}

}
