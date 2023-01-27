package streams;

public class MediaTeste {
	
	public static void main(String[] args) {
		
		Media m1 = new Media().adicionar(9.3).adicionar(6.7);
		Media m2 = new Media().adicionar(2.3).adicionar(1.7);
		
		System.out.println(m1.getValor());
		
		System.out.println(Media.combinar(m1, m2).getValor());
		
		
	}

}
