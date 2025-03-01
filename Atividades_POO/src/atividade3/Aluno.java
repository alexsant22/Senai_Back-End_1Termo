package atividade3;

public class Aluno extends Pessoa { //extends Pessoa
	//atributos
	private String curso;
	private float nota, nota1, nota2;
	//cosntrutor padrao
	public Aluno() {
		System.out.println("Aluno aqui!");
	}
	//construtor parametro
	public Aluno(String nome,String endereco, int telefone, int cpf, int celular, String curso, float nota, float nota1, float nota2) {
		super(nome, endereco, telefone, cpf, celular);
		this.curso = curso;
		this.nota = nota;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	//metodos especiais
	public float calcularMedia(float nota1, float nota2) {
		return (nota1 + nota2) /2;
	}
	public boolean situacaoFinal(float nota) {
		if(nota >= 6) {
			return true;
		}
		return false;
	}
	//getter e setters
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public float getNota1() {
		return nota1;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	public float getNota2() {
		return nota2;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	
}
