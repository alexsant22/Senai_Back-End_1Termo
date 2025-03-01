package atividade4;

public class VasoDecorado extends Vaso {
	//atributos
		private String decoracao;
		
	//construtor padrao
	public VasoDecorado() {
		System.out.println("Vaso decorado feito.");
	}
		
	//construtor com parametro
	public VasoDecorado(String cor, double tamanho, String material, String decoracao) {
		super(cor, tamanho, material);
		this.decoracao = decoracao;
	}
	
	//metodos
	public String getDecoracao() {
		return decoracao;
	}

	public void setDecoracao(String decoracao) {
		this.decoracao = decoracao;
	}
	
	//metodo especial
	public void exibir() {
		super.exibir();
		System.out.println("Decoração: " + decoracao);
	}

}
