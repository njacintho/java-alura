
public class TestaConexao {

	public static void main(String[] args) {

		try (Conexao conect = new Conexao()) {
			conect.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conex?o ");
		}

		// ----------------

//		Conexao conecta = null;
//		try {
//			conecta = new Conexao();
//			conecta.leDados();
//			conecta.fecha();
//		}catch(IllegalStateException ex) {
//			System.out.println("Houve erro na conex?o");
//		}finally {
//			conecta.fecha();
//		}

	}

}
