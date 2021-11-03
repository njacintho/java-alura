package br.com.bytebank.banco.modelo;


/**
 *  
 * @parametro agencia
 * @param numero
 * 
 * @version 0.1
 *
 */
public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	// O static diz que o total( atributo) e da conta( classe ) referece somente a
	// classe
	private static int total;

	// Construtor
	// public Conta( ) {
	// construtor padr�o
	// }

	/*
	 * Ouer uns contrutor padr�o para quando puxado por outras classes ele puxa
	 * esse. public Conta() {
	 * 
	 * }
	 */

	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		
		if(agencia < 1)
			 throw new IllegalArgumentException("Agencia invalida");
		 
		 if(numero < 1) {
			 throw new IllegalArgumentException("Numero da conta invalida");
		 }
		Conta.total++;
		// System.out.println("o total de conta � " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;

		// System.out.println("Estou criando uma conta " + this.numero);
	}

	// void n�o devolve nada

	public abstract void deposita(double valor);

	/**
	 * Valor precisa ser menor ou igual ao saldo
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor a sacar: " + valor);

		}
		this.saldo -= valor;
	}

	// O this diz que ser� essa conta invocada que ser� feito.

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}

	// Retorna o saldo pelo metodo, pois o esmo � privado
	public double getSaldo() {
		return this.saldo;

	}

	// Voce mostra uma informa��o
	public int getNumero() {
		return this.numero;
	}

	// Voc� atribui uma informa��o., numero do lado esquerdo se refere a uma
	// variavel temporaria ela pode ter o mesmo nome do atributo

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("O numero n�o pode ser menor ou igual a 0. ");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("N�o pode ser menor ou igual a 0. ");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
	@Override
	public String toString() {
		return "Numero: " + this.numero;
	}
}