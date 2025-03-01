package aula_03_10;

import java.util.Scanner;

public class AtvRelogio {
	/* Lista doq fazer
	 * variaveis: "F": Frequencia cardiaca atual atleta / "R": Frequencia cardica em repouso / "C": Capacidade de oxigenação
	 * 
	 * Emitir um avisos:
	 * diminuir o ritimo do exercicio quando "F" for maior 3x doq "R" OU "C" for menor que 95
	 * aumentar o ritimo se "F" for menor 2x doq "R" & "C" for maior que 97
	 * manter o ritimo se nenhuma das condicoes anteriores acontecer
	 * 
	 * Saida:
	 * Apenas letras minusculas (aumentar, diminuir e manter)
	 * 
	 * Restrições das regras acima:
	 * 35 <= R =< 100
	 * 35 <= F =< 200
	 * 50 <= c =< 100
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//criando while com condicoes sobre "avisos"
		boolean cond = true;
		//variaveis
		int f; //Frequencia cardiaca atual
		int r; //Frequencia cardiaca em repouso
		int c; //Capacidade de oxigenação
		
		while(cond) {
			System.out.println("Digite sua Frequência cardíaca em repouso:");
			r = scan.nextInt();
			System.out.println("Digite sua Frequência cardíaca atual:");
			f = scan.nextInt();
			System.out.println("Digite sua Capaciade de oxigenação:");
			c = scan.nextInt();
			
			//restriçoes
			if(35 <= r || r <= 100) {
				System.out.println("Vá ao médico ou procure ajuda!!!");
				break;
			} else if(35 <= f || f <= 200) {
				System.out.println("Vá ao médico ou procure ajuda!!!");
				break;
			} else if(50 <= c || c <= 100) {
				System.out.println("Vá ao médico ou procure ajuda!!!");
				break;
			}
			
			//condicionais
			if(f > r*3 || c < 95) {
				System.out.println("diminuir");
			} else if(f < 2*r && c > 97) {
				System.out.println("aumentar");
			} else{
				System.out.println("manter");
			}
			break;
		}

	}

}
