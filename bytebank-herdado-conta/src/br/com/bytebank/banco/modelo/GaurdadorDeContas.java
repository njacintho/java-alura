package br.com.bytebank.banco.modelo;

public class GaurdadorDeContas {
	
	private Conta[] referencias;
	private int posicaolivre;
	
	
	public GaurdadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaolivre = 0; // n�o � nescessario pois 0 � padr�o.
		
	}
	
	public void adiciona(Conta ref) {
		this.referencias[this.posicaolivre] = ref;
		this.posicaolivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaolivre;
	}

	public Conta getPosicaoReferecia(int pos) {
		return this.referencias[pos];
	}
	

}
