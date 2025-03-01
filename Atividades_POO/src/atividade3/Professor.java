package atividade3;

public class Professor extends Pessoa {
	//atributos
	private String nomeCurso;
	private float salario;
	//construtor padrao
	public Professor() {
		System.out.println("Prof. aqui!");
	}
	//construtor com parametro
	public Professor(String nome, String endereco, int telefone, int cpf, int celular, String nomeCurso, float salario) {
		super(nome, endereco, telefone, cpf, celular);
		this.nomeCurso = nomeCurso;
		this.salario = salario;
	}
	//metodos
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
