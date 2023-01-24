package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		//Composição de funçoes ajuda ter um alto grau de reuso nas funçoes
		BinaryOperator<Double> media = (n1,n2) -> (n1 + n2)/2;
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado":"Reprovado";
		System.out.println(media.andThen(conceito).apply(5.5, 9.5));
		
	//--------------------------------------------
		
		BiFunction<Double,Double,String> resultado = 
				(n1 , n2) -> ((n1 + n2)/2) >= 7 ? "Aprovado" :"reprovado";
				
				System.out.println(resultado.apply(7.7, 2.5));
	}

}
