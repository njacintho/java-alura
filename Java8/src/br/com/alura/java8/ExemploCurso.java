package br.com.alura.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Curso {
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}

}

public class ExemploCurso {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(Curso::getAlunos));

		cursos.forEach(c -> System.out.println(c.getNome()));

		System.out.println("Método stream com filtro não alera a lista original");

//		cursos.stream()

//		.filter(c-> c.getAlunos() > 100)
//		.forEach(c -> System.out.println(c.getNome())); filtrando

		int sum = cursos.stream()
				.filter(c -> c.getAlunos() > 100)
				.mapToInt(Curso::getAlunos)
				.sum();
		System.out.println("Soma de horas dos cusos maiores: " + sum);
//		.map(c -> c.getAlunos()) // map.(Curso::getAlunos)
		
//		nomes dos cursos
		Stream<String> nomes = cursos.stream().map(Curso::getNome);
		
		cursos.stream()
		.map(Curso::getNome)
		.forEach(System.out::println);
		
		System.out.println();
		
//		cursos com carga horaria > 50
		cursos.stream()
		.filter(c -> c.getAlunos() > 50)
		.map(Curso::getAlunos)
		.forEach(System.out::println);

	}
}
