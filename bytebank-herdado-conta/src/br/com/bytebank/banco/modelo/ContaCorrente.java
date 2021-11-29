package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	/*
	 * Para puxar o construtor especifico deve se preencher os parametros igual do
	 * contructor. Ou tem um contrutor padr�o no principal.
	 */
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	// O override ele subescreve o m�todo , gerando um polimosfismo.
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {// esta linha tem que ser igual ao m�todo que ser� subescrito
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

	@Override
	public double getvalorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente: " + super.toString();
	}

}
