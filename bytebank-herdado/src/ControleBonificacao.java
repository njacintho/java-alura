/* Polimorfismo udar um m�todo generico que pode puxar o especifico e depois o padr�o
 * 
 * */
public class ControleBonificacao {
	private double soma;
	
	public void  registro(Funcionario f) {
		double bonificacao = f.getBonificacao();
		this.soma = this.soma + bonificacao;
	}
		
	public double getSoma() {
		return soma;
	}

}