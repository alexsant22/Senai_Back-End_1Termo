package aula02;

public class ForEach {

	public static void main(String[] args) {
		//criando um vetor
		int[] idade = {10, 12, 16, 17, 26};
		System.out.println("Lendo vet idade: ");
		System.out.println("Varrendo o vetor");
		
		/*
		System.out.println("Valores: " + idade[0]);
		System.out.println("Valores: " + idade[1]);
		System.out.println("Valores: " + idade[2]);
		System.out.println("Valores: " + idade[3]);
		System.out.println("Valores: " + idade[4]);
		*/
		
		//for tradicional
		int i;
		for(i = 0; i < 5; i++) {
			System.out.println("Lendo: " + i);
			//System.out.println("Valores: " + idade[i]);
		}
		//foreach
		/*for(int obj_vassoura : vetor) {
		}
		*/
		for(int id : idade) {
			System.out.println("Varrendo: " + id);
		}
	}
}
