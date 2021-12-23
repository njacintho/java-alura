package br.com.cursos.alura;

public class Aluno {
	
	private String nome;
	private int ra;
	public Aluno(String nome, int ra) {
		super();
		this.nome = nome;
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public int getRa() {
		return ra;
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", RA: " + this.ra + ". ]";
	}

}
