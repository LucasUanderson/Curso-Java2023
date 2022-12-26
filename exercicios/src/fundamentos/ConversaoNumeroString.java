package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
	    
		
		// Variavel usando wrapper
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
	
		// Variavel usando tipo primitivo		
		int num2 = 10000;
		System.out.println(Integer.toString(num2));

	}

}
