
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);

		System.out.println(" e sua agencia � " + conta.getAgencia());

		/*
		 * Aqui a conta est� incosistente com a regra de neg�cio usando do construtor
		 * padr�o
		 * 
		 * Conta conta = new Conta(); conta.setAgencia(-50); conta.setNumero(-330);
		 */

		conta.setAgencia(1234);
		System.out.println(conta.getAgencia());

		Conta conta2 = new Conta(1337, 24227);
		Conta conta3 = new Conta(1337, 24228);

		System.out.println(Conta.getTotal());
	}

}
// o settter e getter � para a mudan�a