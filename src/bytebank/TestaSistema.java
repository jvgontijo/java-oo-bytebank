package bytebank;

import bytebank.model.Gerente;

public class TestaSistema {
	
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(22221);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
	}
}

