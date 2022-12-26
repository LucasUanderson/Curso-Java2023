package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite primeiro salario");
        String primeiro = entrada.nextLine().replace(",", ".");
		
        System.out.println("digite segundo salario");
		String segundo = entrada.nextLine().replace(",", ".");
		
		System.out.println("digite terceiro salario");
		String terceiro = entrada.nextLine().replace(",", ".");
		
		double numero1 = Double.parseDouble(primeiro);
		double numero2 = Double.parseDouble(segundo);
		double numero3 = Double.parseDouble(terceiro);
		
		double soma = (numero1 + numero2 + numero3) / 2;
	    System.out.println(soma);
	    entrada.close();
	}

}
