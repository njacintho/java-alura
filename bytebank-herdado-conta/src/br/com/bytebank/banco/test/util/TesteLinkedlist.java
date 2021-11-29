package br.com.bytebank.banco.test.util;


import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteLinkedlist {

	public static void main(String[] args) {
		
		/* 
		 * LinkedList � uma lista duplamente encadeada
		 * sempre aponta para o seu anterior e seu sucessor como referenca
		 * para a acessar o indice � nescessario ir desde o inicio 
		 * at� encontrar o elemento que quer
		 * havera na array s� tipo Conta e n�o aseitar� Cliente.
		 */
		List<Conta> lista = new LinkedList<Conta>();
		
		//List<Conta> lista = new Vector<Conta>();
		
//		Conta cc1 = new ContaCorrente(24, 34);
//		Conta cc2 = new ContaCorrente(24, 34);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1); // adicionando na lista de array
		
		Conta cc2 = new ContaCorrente(23, 33);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(23, 11);
		//lista.add(cc3);
		// O contains verifica se a referencia (nome dado) j� existe  
		
		boolean existe = lista.contains(cc3);
		
		System.out.println("a conta j� existe? " + existe);
		
		
		System.out.println("---------------------------------------------");
		
		
		// agora que est� especificado o tipo pode se usar a referecia tipo Conta
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}
