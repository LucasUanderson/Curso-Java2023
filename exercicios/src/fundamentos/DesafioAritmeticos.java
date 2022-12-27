package fundamentos;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5)*(2 - 7);
		double denB = 2;
		
		double supeA = numA / denA;
		double supeB = Math.pow(numB / denB, 2);
		
		double superior= Math.pow(supeA - supeB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println(resultado);
		
		
		
	}
}
