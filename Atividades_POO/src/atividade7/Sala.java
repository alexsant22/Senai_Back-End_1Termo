package atividade7;

public class Sala extends Comodo {
	//atributos
	private boolean temTV;
	
	//bob cosntruto padrao
	public Sala() {
		System.out.println("Sala !");
	}
	
	//bob construtor c/ parametro
	public Sala(String nome, boolean temTV) {
		super(nome);
		this.temTV = temTV;
	}

	//getter e setter
	public boolean getTemTV() {
		return temTV;
	}

}
