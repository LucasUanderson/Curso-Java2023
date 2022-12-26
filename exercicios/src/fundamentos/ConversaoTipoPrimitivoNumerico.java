package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main (String[] args) {
		
		double a = 1; // implícita
		System.out.println(a);
		
		float b = 1.18F;  // explícita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;  // explícita (CAST)
		System.out.println(d);
		
	}
	

}
