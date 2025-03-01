package aula2;

public class TesteCarro {

	public static void main(String[] args) {
		//instanciando objetos da classe Carro
		//classe obj = nova_instancia Metodo?
		Carro c1 = new Carro();
		c1.modelo = "GT3 RS 911";
		System.out.println("O modelo do objeto c1 é: " + c1.modelo);
		
		//adicionando cor ao carro
				c1.cor = "Purple";
				System.out.println("A cor do carro c1 é: " + c1.cor);
				
		c1.potencia = 525f;
		System.out.println("A potencia do objeto c1 é: " + c1.potencia + "cv");
		//vou chamar todos os metodos
		//o carro esta andando
		System.out.println("Estado do carro: " + c1.isParado());
		//mudando o estado do carro
		c1.setParado(true);
		System.out.println("Estado do carro: " + c1.isParado());
		
		c1.getAcelerar();
		c1.setParado(false);
		
	}

}
