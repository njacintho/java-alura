/*
 * Este � uma composi��o que � feita a partir da reutiliza��o de c�digos, onde a l�gica fica em um lugar s�.
 * */
public class AutenticacaoUtil {

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}
