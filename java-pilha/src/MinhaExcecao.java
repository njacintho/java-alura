/*
 * Exce��o do tipo unchecked , n�o precisa ser verificada, pois passa peolo runtime
 * */
public class MinhaExcecao extends RuntimeException {

	public MinhaExcecao(String msg) {
		super(msg);
	}

}
