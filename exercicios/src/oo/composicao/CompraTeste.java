package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Joao pedro";
		compra1.adicionarItem(new Produto("Camisa", 2, 29.99));
		compra1.adicionarItem(new Produto("Cueca", 3, 15.99));
		compra1.adicionarItem(new Produto("Bermuda", 3, 25.00));
		
		System.out.println(compra1.produtos.size());
		System.out.println(compra1.valorValorTotal());
	}

}
