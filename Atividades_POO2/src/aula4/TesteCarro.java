package aula4;

public class TesteCarro {

	public static void main(String[] args) {
		//instaciar objs
		Carro2 c1 = new Carro2();
		Carro2 c2 = new Carro2("Brasilia");
		System.out.println("Modelo: " + c2.modelo);
		Carro2 c3 = new Carro2("VW", " Fuscao TSI");
		System.out.println("Imprimindo\n" + c3.marca + c3.modelo);
		
		//Carro2 carro1 = new Carro2("Audi", " A3");
		//Carro2 carro2 = new Carro2("BMW", " 320i");
		
		c3.exibirInfomações();
		c1.exibirNumCarros();
		//nao precisei instaciar um obj
		//invoquei o metodo diretamente pela classe
		Carro2.exibirNumCarros();
		

	}

}
