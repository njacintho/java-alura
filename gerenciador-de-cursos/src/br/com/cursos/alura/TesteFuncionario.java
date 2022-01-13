package br.com.cursos.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionarios f1 = new Funcionarios("Ana luisa Braga", 25);
		Funcionarios f2 = new Funcionarios("Luis Souza", 48);
		Funcionarios f3 = new Funcionarios("Rosangela de Carvalho", 19);
		
		Set<Funcionarios> funcionarios = new TreeSet<>(new OrdenaPorIdade());
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		
		
		Iterator<Funcionarios> iterator = funcionarios.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getNome());
		}
		
	}

}
