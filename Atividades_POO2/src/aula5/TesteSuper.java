package aula5;

public class TesteSuper {

	public static void main(String[] args) {
		//instaciar objs
		SuperClasse sup = new SuperClasse();
		sup.a = 20;
		System.out.println("dados1: " + sup.a);
		System.out.println("dados1: " + sup.b);
		
		SubClasse sub = new SubClasse();
		//sub.a = 111;
		//sub.setA(100);
		sub.c = 222;
		System.out.println("Valor: " + sub.getA());
		sub.getA();
	}

}
