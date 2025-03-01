package atv_trat_excecao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		try {
			FileReader ler1 = new FileReader("D:\\Senai\\LPA\\Atividades_LPA\\src\\atv_trat_excecao\\Arquivo.txt");
			Scanner scan = new Scanner(ler1);
			while(scan.hasNextLine()) {
				String arquivo = scan.nextLine();
				System.out.println(arquivo);
			}
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
