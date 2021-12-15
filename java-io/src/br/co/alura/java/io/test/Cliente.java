package br.co.alura.java.io.test;

import java.io.Serializable;

/***
 * Classe representa um cliente no Bytebank
 * 
 * @author Noemi
 * @version 0.1
 * 
 */

public class Cliente implements Serializable{

	/**
	 * serialização através do numero de posição., verionamento de classe
	 */
	private static final long serialVersionUID = -1902288297635744180L;
	
	private String nome;
	private String cpf;
	private String profissao;

	public String getNomeCpf() {
		return nome + ", " + cpf;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
