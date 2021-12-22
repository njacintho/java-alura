package br.com.cursos.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunosSemAcentos {
	
	public static void main(String[] args) {
		Set<String> alunas = new HashSet<>();
		
		alunas.add("Ana clara");
		alunas.add("Ana Lu�za");
		alunas.add("Isalene Jacintho");
		alunas.add("Noemi Olivera Jacintho");
		alunas.add("Larissa Nascimento");
		
		
		System.out.println(alunas.size());
		
		// Inserindo aluna existente
		alunas.add("Ana clara");
		
		System.out.println(alunas.size());
		
		boolean adionado = alunas.add("Ma�sa Jacintho");
		System.out.println("Ma�sa foi adionada a lista? " + adionado);
		
		System.out.println(alunas.size());
	}

}
