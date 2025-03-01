package aula02;

public class ExemploFor {

	public static void main(String[] args) {
		int parada = 3;
		System.out.println("Varrendo...");
		int i;	
		for(i = 0; i < parada; i = i + 1) {
			System.out.println("Valor de i: " + i);
		}
	}	
}
