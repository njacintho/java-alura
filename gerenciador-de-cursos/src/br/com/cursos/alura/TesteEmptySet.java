package br.com.cursos.alura;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {
	
	public static void main(String[] args) {
		Set<String> nomes = Collections.emptySet();
		
		nomes.add("Paulo");
		
		
		
		/***
		 * Nessse teste é voltado uma exceção 
		 * Exception in thread "main" java.lang.UnsupportedOperationException
		 * 
		 * Um conjunto destinado ser vazio  Collections.emptySet();
		 * não pode receber um elemento
		 * nomes.add("Paulo");
		 * Quando uma reunião foi cancelada não se pode adicionar participante( teria que tratar o erro
		 */
	}

}
