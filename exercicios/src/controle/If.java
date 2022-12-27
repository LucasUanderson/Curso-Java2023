package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe a média");
		
		String nota = entrada.nextLine().replace(",", ".");
		double numero1 = Double.parseDouble(nota);
		
		if(numero1 < 7.0 && numero1 <= 5.0 ) {
			System.out.println("Recuperação");			
		}if(numero1 >= 7.0) {
			System.out.println("Aprovado");
		}
		
		
		entrada.close();
		
		

	}
}
