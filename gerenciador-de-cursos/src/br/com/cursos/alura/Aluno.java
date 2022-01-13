package br.com.cursos.alura;

import java.util.Objects;

//public class Aluno implements Comparable<Aluno>{
public class Aluno {
	
	private String nome;
	private int ra;
	
	public Aluno(String nome, int ra) {
		if(nome == null) {
			throw new NullPointerException("Nome não pode ser fazio(nulo)");
		}
		this.nome = nome;
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public int getRa() {
		return ra;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		
//		Aluno outro = (Aluno) obj;;
//		return this.nome.equals(outro.nome);
//	}
	
//	@Override
//	public int hashCode() {
//		return this.nome.hashCode();
//	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", RA: " + this.ra + ". ]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome, ra);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && ra == other.ra;
	}
	
//	@Override
//	public int compareTo(Aluno o) {
//		
//		return 0;
//	}

}
