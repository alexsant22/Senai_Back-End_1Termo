package atividade2;

public class Visitante {

	//atributos
	private String nome;
	private int idade;
	private double altura;
	//criando construtor padrao
	public Visitante(String no, int id, double al) {
		this.nome = no;
		this.idade = id;
		this.altura = al;
	}
	//metodos get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String no) {
		this.nome = no;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int id) {
		this.idade = id;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double al) {
		this.altura = al;
	}
	public boolean podeAndarNoBrinquedo(double altura, int idade){
		if(altura < 1.50 && idade < 13) {
			System.out.println("Não pode andar");
			return false;
		} else {
			System.out.println("Pode andar");
			return true;
		}
	}
	
	public void exibirinfo() {
		System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "m");
	}
	
}


