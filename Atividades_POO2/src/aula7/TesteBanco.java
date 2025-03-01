package aula7;

public class TesteBanco {

	public static void main(String[] args) {
		CaixaEletronico cxel = new CaixaEletronico();
		cxel.sacar(1000);
		CaixaEletronico cx = new Caixa();
		cx.sacar(1000);
		Santander st = new Santander();
		st.sacar(1000);//double
		st.sacar(1000.0);
		
	}
}
