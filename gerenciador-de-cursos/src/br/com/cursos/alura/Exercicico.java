package br.com.cursos.alura;

import java.util.HashMap;
import java.util.Map;

public class Exercicico {

	public static void main(String[] args) {
		 // Ordenando a cole��o pela interface Map
		Map<Integer, String> pessoas = new HashMap<>();
		
		pessoas.put(21, "Leonardo Cordeiro");
		pessoas.put(27, "F�bio Pimentel");
		pessoas.put(19, "Silvio Matos");
		pessoas.put(23, "Romulo Henrique");
		
		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});

	}

}
