package aula03;

import java.util.ArrayList;

public class array3 {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		// adicione num int na sua lista
		lista.add(01);
		lista.add(02);
		
		//varredura(leitura)
		for(Integer num : lista) {
			System.out.println("itens: " + num);
		}
		//ler itens por indice!
		int ver_conteudo = lista.get(0);
		System.out.println("item é: " + ver_conteudo);

	}//fim main

}//fim classe
