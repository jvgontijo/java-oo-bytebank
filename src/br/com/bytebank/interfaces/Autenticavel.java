package br.com.bytebank.interfaces;

public abstract interface Autenticavel {
	
	public void setSenha(int senha);
	
	public boolean autentica(int senha);

}
