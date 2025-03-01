package atividade7;

public abstract class Comodo {
	//atributos
	private String nome;
	
	//bob construtor padrao
	public Comodo() {
		System.out.println("Comodo !");
	}
	
	//bob construtor c/ parametro
	public Comodo(String nome) {
		this.nome = nome;
	}

	//getter e setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
