package atividade1;

public class Dog {
	//atributos
	private String nome;
	private float peso;
	private char sexo;
	private int qtdPatas;
	
	//modelo construtor
	public Dog() {
		//System.out.println("Acabei de nascer!");
	}
	//metodos atributos
	public String getNome(){
		return nome;
	}
	public void setNome(String N) {
		this.nome = N;
	}
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float P){
		this.peso = P;
	}
	
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char S) {
		this.sexo = S;
	}
	
	public int getQtdPatas() {
		return qtdPatas;
	}
	public void setQtdPatas(int Qp) {
		this.qtdPatas = Qp;
	}
	
	//metodos especiais
	public void getLatir() {}
	public void getCorrer() {}
	public void getBrincar() {}
	public void getDormir() {}
	

}
