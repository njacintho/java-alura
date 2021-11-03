
public class Conta {

	private double saldo;
	int agencia;
	int numero;
	Cliente titular;

	// void n�o devolve nada

	public void deposita(double valor) {
		this.saldo += valor;

	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	// O this diz que ser� essa conta invocada que ser� feito.

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} // o else nesse caso � opcional pois o return j� para a instru��o
		return false;
	}

	// Retorna o saldo pelo metodo, pois o esmo � privado
	public double getSaldo() {
		return this.saldo;

	}
}