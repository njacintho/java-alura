package br.com.alura.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//class Curso2 {
//	private String nome;
//	private int alunos;
//
//	public Curso2(String nome, int alunos) {
//		this.nome = nome;
//		this.alunos = alunos;
//	}
//
//	public String getNome() {
//		return nome;
//	}
//
//	public int getAlunos() {
//		return alunos;
//	}
//
//}

public class ExemploCursoEntry {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(Curso::getAlunos));

		cursos.forEach(c -> System.out.println(c.getNome()));

		System.out.println("Método stream com filtro não alera a lista original");

		OptionalDouble media = cursos.stream()
				.filter(c -> c.getAlunos() > 100)
				.mapToInt(Curso::getAlunos)
				.average();

		System.out.println("A média de horas dos cusos maiores: " + media); // int sum = cursos.stream()
		
		
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.findAny()
		.ifPresent(c -> System.out.println(c.getNome())); // com ifpresent se não achar não devolve nada

//		Optional<Curso> optionaalCurso = cursos.stream()
//		.filter(c -> c.getAlunos() >= 1000)
//		.findAny();
//		
//		optionaalCurso.ifPresent(c -> System.out.println(c.getNome())); // com ifpresent se não achar não devolve nada
		
	//	Curso curso =	optionaalCurso.get(); // se ele encontaar devolve ok, senão lança uma exception exemplo maior que 1000 optionaalCurso.orElse(null);
	//	Curso curso = optionaalCurso.orElse(null); // retorna uma exception no print
		
	//	System.out.println(curso.getNome());
		
		System.out.println();
		// capturandos os dados a partir do filtro utilizando os coletors  ou pode retornar para a mesma variavel
		List<Curso> resultados = cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.collect(Collectors.toList());
		
		resultados.stream()
		.forEach(c -> System.out.println(c.getNome()));;
		
		// toMap receber duas funções, uma chave e um valor, pelo foreach podemos colocar dois valores usando o map
		cursos.parallelStream()
		.filter(c -> c.getAlunos() >= 100)
		.collect(Collectors.toMap(
				c -> c.getNome(), c -> c.getAlunos()))
		.forEach((nome, alunos) -> System.out.println(nome + " tem "+ alunos + " alunos."));
		

	

	}
}
