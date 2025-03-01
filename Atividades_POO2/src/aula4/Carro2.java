package aula4;

public class Carro2 {
		
		//variavel de classe
		static int numeroDeCarros;
		//todas as instancias compartilham a mesma variavel
		//variaveis de instancia
		//cada obj tera sua propria copia dessa variavel
		public String marca;	
		public String modelo;
		public int numPortas;
		//construtor PADRAO da classe
		Carro2(){
			System.out.println("Acabei de nascer sem caracteristicas");
		}
		
		//construtor com parametro
		Carro2(String modelo){
			this.modelo = modelo;
		}
		
		//construtor com parametros
		Carro2(String marca, String modelo){
			this.marca = marca;
			this.modelo = modelo;
			//cada vez que cria um obj a variavel incrementa
			numeroDeCarros++;
		}
		public void exibirInfomações() {
			System.out.println("Marca: " + marca + "\n" + "Modelo: " + modelo);
		}
		//metodo estatico
		public static void exibirNumCarros() {
			numeroDeCarros++;
			System.out.println("Total de carros: " + numeroDeCarros);
		}
}	

