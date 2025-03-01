package aula7;

public class Santander extends CaixaEletronico {
	//sobrescrita
	@Override
	public void sacar(double valor) {
		valor = valor + 0.9;
		System.out.println("o seu saque1 no santander foi = " + valor);
	}
	//sobrecarga
	public void sacar(float valor) {
		valor = valor + 0.5f;
		System.out.println("o seu saque2 no santander foi = " + valor);
	}
}
