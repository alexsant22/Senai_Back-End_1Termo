package aula7;

public class TesteSobrecarga {

	public static void main(String[] args) {
		//instanciar obj
		Sobrecarga sob1 = new Sobrecarga();
		sob1.soma(10, 5);
		System.out.println("Teste1: " + sob1.soma(10, 5));
		System.out.println("Teste1: " + sob1.soma("churras", "quinho"));

	}//main

}//clase
