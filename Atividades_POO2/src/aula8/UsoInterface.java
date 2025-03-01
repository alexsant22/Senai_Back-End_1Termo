package aula8;

public class UsoInterface implements InterfacePai {
	//atributos
	String a;
	//metodo construtor
	public UsoInterface() {
		System.out.println("Nasci");
	}
	@Override
	public void metodo1() {
		System.out.println("Chamei metodo 1");
	}
	@Override
	public void metodo2() {
		System.out.println("Chamei metdodo 2");
	}
}
