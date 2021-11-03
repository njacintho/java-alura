
public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaDoLucas = new Conta();
		contaDoLucas.saldo = 200;
		contaDoLucas.deposita(50);
		System.out.println(contaDoLucas.saldo);

		boolean conseguiuReirar = contaDoLucas.saca(85);
		System.out.println(contaDoLucas.saldo);
		System.out.println(conseguiuReirar);

		Conta contaDaNoemi = new Conta();
		contaDaNoemi.deposita(1000);

		// a instru��o dentro do if � um boolean ent�o pode ser passado dentro do if
		if (contaDaNoemi.transfere(3500, contaDoLucas)) {
			System.out.println("Tranferencia feita com sucesso! ");
		} else {
			System.out.println("Voc� n�o tem saldo suficiente! ");
		}
		System.out.println(contaDaNoemi.saldo);

		System.out.println(contaDoLucas.saldo);
	}
}
