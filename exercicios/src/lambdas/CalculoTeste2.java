package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		Calculos calc = (x, y) -> {return x + y;};
		System.out.println(calc.executar(5, 10));
		
		
		calc = (x , y) -> x * y;
		System.out.println(calc.executar(6, 10));
	}

}
