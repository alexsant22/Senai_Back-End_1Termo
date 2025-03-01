package aula7;

public class Sobrecarga {

	//foco nos metodos
	
	public int soma(int a, int b) {
		return a +b;
	}
	public double soma1(double a, int b) {
		return a +b;
	}
	public String soma(String a, String b) {
		return a + b;
	}
	public String soma(String a, int b) {
		return a + b;
	}
	public void soma(int a, int b, int c) {
		System.out.println(a + b + c );
	}
	public int soma(int a) {
		return a;
	}
	
}
