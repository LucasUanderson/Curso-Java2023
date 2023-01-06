package arrays;

import java.util.Arrays;

public class ExerciciosArr {
	
	public static void main(String[] args) {
		
		// Criação de array com 3 posiçoes 
		double[] notasAlunoA = new double[3];
		
		//Colocando valores dentro de array
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;	
		
		// Arrays.toString(notasAlunoA) amostra a lista de elementos dentro do array
		System.out.println(Arrays.toString(notasAlunoA));
		
		
		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA /notasAlunoA.length );
		
		//________________________________________________________________________
		
		// inicializou as notas diretamente apartir de valores literais
		double[] notasAlunoB = {6.9,8.9,5.5,10.0};
		
		// Exercicio mude o controler for para forEach
		
		for(double nota:notasAlunoB) {
			System.out.println(nota);
		}
		
		
		
		
	}

}
