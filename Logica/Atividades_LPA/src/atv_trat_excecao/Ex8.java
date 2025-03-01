package atv_trat_excecao;

import java.util.Scanner;

class EstoqueInsuficiente extends Exception {
	public EstoqueInsuficiente(String mensagem) {
		super(mensagem);
	}
}

public class Ex8 {

	public static void verifica_estoque(int estoque, int compra) throws EstoqueInsuficiente {
		if (estoque < compra) {
			throw new EstoqueInsuficiente("ERRO: Estoque insuficiente.");
		} else {
			System.out.println("Comprando...");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Digite quantos produtos deseja comprar:");
			int buy = scan.nextInt();
			Ex8 c1 = new Ex8();
			c1.verifica_estoque(50, buy);
			scan.close();

		} catch (EstoqueInsuficiente e) {
			System.out.println(e.getMessage());
		}

	}

}
