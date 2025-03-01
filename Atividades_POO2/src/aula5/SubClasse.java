package aula5;

public class SubClasse extends SuperClasse {

	//atributos
	protected int c;
	protected int d;
	//construtor
	public SubClasse() {
		System.out.println("Nasci usando construtor padrão");
	}
	public SubClasse(int a, int b, int c, int d) {
		super.a = a;
		super.b = b;
		this.c = c;
		this.d = d;
	}
	public SubClasse(int a, int c) {
		super.a = a;
		this.c =c;
	}
	//metodos gatters e setters
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	
	
	public String toString() {
		return "Você chamou o 'toString' da sub-classe";
	}
	
}//fim classe
