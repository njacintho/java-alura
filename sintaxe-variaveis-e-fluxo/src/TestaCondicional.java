
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		
		if(idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos.");
			System.out.println("Bem vindo");
			// quando a somente uma instru��o dentro do if
			// pode ser retirados as chaves do if 
		}
		else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� n�o tem 18 anos, "
						+ "mas est� acompanhado ent�o pode entrar");
			}
			else {
			System.out.println("Infelizmente voc� n�o pode entrar");
			}
		}
	}
}
