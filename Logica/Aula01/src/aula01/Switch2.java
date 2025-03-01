package aula01;

public class Switch2 {
	//declarando vetor dias com constates dom, seg...
	public enum dias {dom, seg, ter, qua, qui, sex}
	
	public static void main(String[] args) {
		//vetor dias
		//diasHoje obj
		dias[] diasHoje = dias.values();
		//for()inicio;termino;incremento|)
		for(dias agora : diasHoje) {
			switch (agora) {
			case dom:
				System.out.println("Domingão");
				break;
			case seg:
				System.out.println("Segunda-Feira");
				break;
			case ter:
				System.out.println("Terça-Feira");
				break;
			case qua:
				System.out.println("Quarta-Feira");
				break;
			case qui:
				System.out.println("Quinta-Feira");
				break;
			case sex:
				System.out.println("Sexta-Feira");
				break;
			default:
				System.out.println("Dia da semana inválido.");
				break;
			}//fim switch
		}//fim for
	}//fim main
}//fim classe
