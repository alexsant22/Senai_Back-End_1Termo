package aula7;

public class Caixa extends CaixaEletronico {
	
	//sobrescrita de metodo!!!
	//o que foi herdado? sacar()
	@Override
	public void sacar(double valor) {
		valor = valor + 10;
		System.out.println("o seu saque do caixa economica federal foi = " + valor);
	}
	
}//classe

