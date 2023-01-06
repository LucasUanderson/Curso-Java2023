package Classes;

public class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data(16,12,1996);
		
		Data d2 = new Data();
		d2.ano = 2024;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
	
		
	}

}
