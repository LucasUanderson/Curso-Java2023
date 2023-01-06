package controle;

import java.util.Scanner;

public class SwitchSemBreak {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		
		
		
		String faixa = entrada.next();

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("sei o tekki shodan");
		case "roxa":
			System.out.println("Sei o heian godan");
		case "verde":
			System.out.println("Sei o heian yodan");
		case "laranja":
			System.out.println("Sei o heian sandan");
		case "vermelha":
			System.out.println("Sei o heian nidan");
		case "amarela":
			System.out.println("Sei o heian shodan");
		default:
			System.out.println("Não sei nada");
		}
		
		entrada.close();
	}

}
