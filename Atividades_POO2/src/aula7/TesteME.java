package aula7;

public class TesteME {
	public static void main(String[] args) {
		MetodoEstatico me = new MetodoEstatico();
		System.out.println("Chamando met est: " + me.soma(10, 7));
		
		System.out.println("Chamando met est sem obj: " + MetodoEstatico.soma(2, 5));
	}
}
