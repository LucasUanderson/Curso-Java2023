package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		// escaneia a resposta do usuario
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a nota ");
		// guarda a entrada na variavel nota
		double nota = entrada.nextDouble();

		if (nota > 10 || nota < 0) {
			System.out.println("valores invalidos");
		} else if (nota >= 8.0) {
			System.out.println("Conceito A");
		} else if (nota >= 6.0) {
			System.out.println("Conceito B");
		} else if (nota >= 4.0) {
			System.out.println("Conceito C");
		} else if (nota >= 2.0) {
			System.out.println("Conceito D");
		}

		entrada.close();

	}

}
