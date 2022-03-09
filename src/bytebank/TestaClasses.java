package bytebank;

import bytebank.model.Cliente;
import bytebank.model.Conta;

public class TestaClasses {
	public static void main(String[] args) {
		
		Conta contaAna = new Conta(1930, 22345);
		Cliente ana = new Cliente();
		
		contaAna.setTitular(ana);
		contaAna.getTitular().setNome("Ana");
		System.out.println(ana.getNome());
		System.out.println(Conta.getTotal());
		
		Conta contaJoao = new Conta(1234, 22130);
		
		contaJoao.setTitular(new Cliente());
		contaJoao.getTitular().setNome("João");
		System.out.println(contaJoao.getTitular().getNome());
		System.out.println(Conta.getTotal());
	}
}