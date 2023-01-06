package Classes;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		
		
		Produto p2 = new Produto();
		p2.nome = "Celular";
		p2.preco =1800.00;
	
		
		
		System.out.println(p2.precoComDesconto());
		
		
		
		
		
	}

}
