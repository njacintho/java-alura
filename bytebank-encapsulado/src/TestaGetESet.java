
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		// conta.numero = 1334 por atribui��o
		// POr m�todo
		//conta.setNumero(1337); para construtor padr�o
		System.out.println(conta.getNumero());

		Cliente paulo = new Cliente();
		// conta.titular = paulo;

		paulo.setNome("Paulo Silveira");

		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		// aponta para a informa��o armazenada dentro.

		conta.getTitular().setProfissao("Desenvolvedor");

		// agora em duas linhas o mesmo comnando
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Desenvolvedor");
		
		
		//eeses tres prints imprime a mesma coisa Cliente@76ccd017, o local de armazenamento da informa��o.
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());

	}

}
