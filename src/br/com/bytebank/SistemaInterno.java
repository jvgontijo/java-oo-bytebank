package br.com.bytebank;

import br.com.bytebank.interfaces.Autenticavel;
import br.com.bytebank.model.Gerente;

public class SistemaInterno {
	private int senha = 2222;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode entrar no sistema");
		} else {
			System.out.println("Não pode entrar no sistema. Senha incorreta");
		}
	}
}
