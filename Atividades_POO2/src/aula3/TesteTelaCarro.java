package aula3;

import java.util.Scanner;

public class TesteTelaCarro {

	public static void main(String[] args) {
		//digitar no console
		//obj teclado recebe informação digitada pelo usuário
		Scanner teclado = new Scanner(System.in);
		
		//instanciar os obj da classe
		Carro c1 = new Carro();
		System.out.println("Digite o modelo do carro: ");
		String model = teclado.nextLine();
		//c1.modelo = model; ou
		c1.setModelo(model);
		System.out.println("O modelo é: " + c1.getModelo());
		
		//***potencia***
		System.out.println("Digitar a potência do carro: ");
		float pot = teclado.nextFloat();
		c1.setPotencia(pot);
		System.out.println("A potência é: " + c1.getPotencia());
		
		//***parado***
		System.out.println("O carro está parado? (true or false)");
		boolean par = teclado.nextBoolean();
		c1.setParado(par);
		System.out.println("Estado do carro... " + (c1.isParado() ? "Parado":"Em movimento"));
		c1.getAcelerar();
		
		//limpo o obj da mem RAM
		teclado.close();
	}
}
