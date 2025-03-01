package atividade7;

public class Quarto extends Comodo {
	//atributos
	private int numeroCamas;
	
	//bob construtor padrao
	public Quarto() {
		System.out.println("Quarto !");
	}
	
	//bob construtor c/ parametro
	public Quarto(String nome, int numeroCamas) {
		super(nome);
		this.numeroCamas = numeroCamas;
	}

	//getter e setter
	public int getNumeroCamas() {
		return numeroCamas;
	}

	public void setNumeroCamas(int numeroCamas) {
		this.numeroCamas = numeroCamas;
	}

}
