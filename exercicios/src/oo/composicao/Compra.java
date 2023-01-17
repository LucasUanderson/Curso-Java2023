package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Produto> produtos = new ArrayList<>();
	
	
	void adicionarItem(Produto produtos1){
		this.produtos.add(produtos1);
		produtos1.compra = this;
		
	}
	
	double valorValorTotal () {
		double total = 0;
		for (Produto item: produtos) {
			total += item.quantidade * item.preco;
		}
		
		return total;
	}

}
