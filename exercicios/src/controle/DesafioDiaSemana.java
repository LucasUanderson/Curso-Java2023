package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		// Escaneia entrada
	    Scanner entrada = new Scanner(System.in);
		
			
		
		System.out.printf("Escreva o dia da semana: ");
		// pega a entrada
		String dia = entrada.next();
		
		

		if (dia.equalsIgnoreCase("segunda-feira")) {
			System.out.println(2);
		} else if (dia.equalsIgnoreCase("terça-feira")) {
			System.out.println(3);
		} else if (dia.equalsIgnoreCase("quarta-feira")) {
			System.out.println(4);
		} else if (dia.equalsIgnoreCase("quinta-feira")) {
			System.out.println(5);
		} else if (dia.equalsIgnoreCase("sexta-feira")) {
			System.out.println(6);
		} else if (dia.equalsIgnoreCase("sabado")) {
			System.out.println(7);
		} else if (dia.equalsIgnoreCase("domingo")) {
			System.out.println(8);
		}

		entrada.close();
	}

}
