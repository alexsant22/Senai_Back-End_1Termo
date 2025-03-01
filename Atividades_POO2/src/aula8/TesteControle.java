package aula8;

public class TesteControle {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		ControleRemoto controle1 = new Tv();
		controle1.ligar();
		controle1.volumeMais(10);
		controle1.volumeMenos(11);
		controle1.desligar();
		controle1.getPolegada();
		System.out.println("Polegada da tv: " + controle1.getPolegada());

	}

}
