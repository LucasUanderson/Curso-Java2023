package streams;

public class Produtos {
	
	private String nome;
	private double preco;
	private double desconto;
	private boolean frete;
	
	public Produtos(String nome, double preco, double desconto, boolean frete) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.frete = frete;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public boolean getFrete() {
		return frete;
	}

	public void setFrete(boolean frete) {
		this.frete = frete;
	}
	


}


