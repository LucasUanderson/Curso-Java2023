package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("digite o primeiro numero");
		double a = entrada.nextDouble();
		
		System.out.println("digite o segundo numero");
		double b = entrada.nextDouble();
		
		System.out.println("digite a operação");
		String c = entrada.next();
		
		//logica
		
		double resultado = "+".equals(c) ? a + b : 0;
		resultado = "-".equals(c) ? a - b : resultado;
		resultado = "*".equals(c) ? a * b : resultado;
		resultado = "/".equals(c) ? a / b : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f",a,c,b,resultado);
		
		
		
		entrada.close();
		
		
		

	}

}
