
public class Conta {

	double saldo;
	int agencia;
	int numero;
	String titular;

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

	//O this diz que ser� essa conta invocada que ser� feito.
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} // o else nesse caso � opcional pois o return j� para a instru��o
		return false;
	}
}