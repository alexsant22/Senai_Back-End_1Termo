package atividade4;

public class Vaso {

	//atributos
	private String cor;
	private double tamanho;
	private String material;
	
	//construtor padrao
	public Vaso() {
		System.out.println("Vaso feito.");
	}
	
	//construtor com paranmetro
	public Vaso(String cor, double tamanho, String material) {
		this.cor = cor;
		this.tamanho = tamanho;
		this.material = material;
		
	}
	
	//metodos
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	//metodo especial
	public void exibir() {
		/* Nao funciona
		 this.cor = cor;
		 this.tamanho = tamanho;
		 this.material = material;
		 */
		System.out.println("Cor: " + cor + "\nTamanho: " + tamanho + "\nMaterial: " + material);
	}
}
