package atividade4;

import java.util.Scanner;

public class TesteVaso {

	public static void main(String[] args) {
		//scanner criado
		Scanner t = new Scanner(System.in);
		
		//funcoes scanner
		System.out.println("Vaso 1");
		System.out.println("Digite a cor:");
		String c = t.nextLine();
		
		System.out.println("Digite o tamanho:");
		double ta = t.nextDouble();
		
		System.out.println("Digite o material:");
		String m = t.next();
		System.out.println("");
		
		//instanciando objs v1
		Vaso v1 = new Vaso(c, ta, m);
		v1.exibir();

		//v2
		System.out.println("");
		System.out.println("Vaso 2");
		System.out.println("Digite a cor:");
		String c1 = t.next();
		
		System.out.println("Digite o tamanho:");
		double ta1 = t.nextDouble();
		
		System.out.println("Digite o material:");
		String m1 = t.next();
		System.out.println("");
		
		Vaso v2 = new Vaso(c1, ta1, m1);
		v2.exibir();
		
		//instanciar objs decorado vd1
		System.out.println("");
		System.out.println("Vaso decorado 1");
		System.out.println("Digite a cor:");
		String cd = t.next();
		
		System.out.println("Digite o tamanho:");
		double tad = t.nextDouble();
		
		System.out.println("Digite o material:");
		String md = t.next();
		
		System.out.println("Decoração:");
		String d = t.next();
		System.out.println("");
		
		VasoDecorado vd1 = new VasoDecorado(cd, tad, md, d);
		vd1.exibir();
		
		//vd2
		System.out.println("");
		System.out.println("Vaso decorado 2");
		System.out.println("Digite a cor:");
		String cd1 = t.next();
		
		System.out.println("Digite o tamanho:");
		double tad1 = t.nextDouble();
		
		System.out.println("Digite o material:");
		String md1 = t.next();
		
		System.out.println("Decoração:");
		String d1 = t.next();
		System.out.println("");
		
		VasoDecorado vd2 = new VasoDecorado(cd1, tad1, md1, d1);
		vd2.exibir();
		

	}

}
