package br.com.cursos.alura;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {
	
	public static void main(String[] args) {
		Set<String> nomes = Collections.emptySet();
		
		nomes.add("Paulo");
		
		
		
		/***
		 * Nessse teste � voltado uma exce��o 
		 * Exception in thread "main" java.lang.UnsupportedOperationException
		 * 
		 * Um conjunto destinado ser vazio  Collections.emptySet();
		 * n�o pode receber um elemento
		 * nomes.add("Paulo");
		 * Quando uma reuni�o foi cancelada n�o se pode adicionar participante( teria que tratar o erro
		 */
	}

}
