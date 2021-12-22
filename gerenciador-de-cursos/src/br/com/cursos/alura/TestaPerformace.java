package br.com.cursos.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformace {
	
	public static void main(String[] args) {
		Collection<Integer> numeros = new ArrayList<Integer>();  // Tempo gasto: 2019 mili
	
		
//		Collection<Integer> numeros = new HashSet<>(); //Tempo gasto: 49 mili
		
		long inicio = System.currentTimeMillis();
		
		for(int i= 1; i <= 50000; i++) {
			numeros.add(i);
		}
		
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}
		
		long fim = System.currentTimeMillis();
		
		long tempoDeExecucao = fim - inicio;
		
		System.out.println("tempo gasto no inicio " + inicio);
		
		System.out.println("tempo gasto no fim " + fim);
		
		System.out.println("Tempo gasto: " + tempoDeExecucao);
	}

}
