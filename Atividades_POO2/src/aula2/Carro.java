package aula2;

		//nome da classe GENERICA
public class Carro {
	//atributos
	public String modelo;
	public float potencia;
	public boolean parado;
	public String cor;
	//metodo construtor
	public Carro() {
		System.out.println("Acabei de ser instanciado.");
	}
	//metodos
	public String getModelo() {
		return modelo;
		
	} //fecha setModelo()
	public void setModelo(String m) {
		this.modelo = m;
	}
	public float getPotencia() {
		return potencia;
		
	}//fecha getPotencia()
	public void setPotencia(float p) {
		this.potencia = p;
	}
	//metodos especiais
	public boolean getAcelerar() {
		if(parado == true) {
			System.out.println("sem movimento... começando a andar...");
		}else {
			System.out.println("andando...");
		} {
			System.out.println("De 0 a 100km/h em 3,2 seg.");
		}
		return parado;
	}
	public boolean getFrear() {
		if(parado == true) {
			System.out.println("acionei o freio...");
		}else {
			System.out.println("Socorroooo... sem freio!!");
		}
		return parado;
		
	}
	//verifica o estado do carro (parado ou andando)
	public boolean isParado() {
		return parado;
	}
	//aqui eu mudo o estado (andando ou parado) do carro
	public void setParado(boolean pa) {
		this.parado = pa;
		
	}
	public String getCor() {
		return cor;
	}
	
	public void setCor(String c) {
		this.cor = c;
	}
}
