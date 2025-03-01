package atividade2;

public class Brinquedo {

	//atributos
	private String nome;
	private double alturaMinima;
	private int capacidadeMaxima;
	//criando construtor padrao
	public Brinquedo(String n, double aM, int cM) {
		this.nome = n;
		this.alturaMinima = aM;
		this.capacidadeMaxima = cM;
	}
	
	//metodos get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public double getAlturaMinima() {
		return alturaMinima;
	}
	public void setAlturaMinima(double aM) {
		this.alturaMinima = aM;
	}
	public int getCapacidadeMAxima() {
		return capacidadeMaxima;
	}
	public void setCapacidadeMAxima(int cM) {
		this.capacidadeMaxima = cM;
	}
	public void exibirinfo() {
		/*this.nome = nome;
		this.alturaMinima = alturaMinima;
		this.capacidadeMaxima = capacidadeMaxima;
		*/
		System.out.println("Nome do brinquedo: " + nome + "\nAltura Mínima: " + alturaMinima + "\nCapacidade Máxima: " + capacidadeMaxima);
	}
	
}
