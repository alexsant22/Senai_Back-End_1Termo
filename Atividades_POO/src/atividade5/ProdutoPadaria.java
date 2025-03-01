package atividade5;

public class ProdutoPadaria implements Produto {
	//atributos
	private String nome;
	private double preco;
	
	//bob construtor
	public ProdutoPadaria() {
		System.out.println("Padaria Pão Gordinho");
	}
	//bob construtor c/ parametro
	public ProdutoPadaria(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public double getPreco() {
		return preco;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void setPreco(double preco) {
		this.preco = preco;
	}
	//metodo exibir()
	void exibir(String nome, double preco) {
		System.out.println("Nome do produto: " + nome);
		System.out.println("Preço: " + "R$" + preco);
		System.out.println(""); //espaçamento
	}
}
