package aula_26_09;

import java.util.Scanner;

public class Q4_2 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = t.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int num2 = t.nextInt();
		
		//criar método
		int mmc = calcularMMC(num1, num2);
		System.out.println("O MMC do " + num1 + " e do" + num2 + " é: "
				+ mmc);
	}

	private static int calcularMMC(int num1, int num2) {
		int max = Math.max(num1, num2);
		int mmc = max;
		while (mmc % num1 != 0 || mmc % num2 != 0) {
			mmc = mmc + max;
		}
		return mmc;
	}

}
