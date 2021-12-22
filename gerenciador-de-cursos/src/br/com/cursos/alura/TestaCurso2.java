package br.com.cursos.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções de java", "Paulo Silveira");

//		List<Aula> aulas = javaColecoes.getAulas();
//		System.out.println(aulas);
//		aulas.add(new Aula("Trabalhando com Arraylist", 21));
//		System.out.println(aulas);

//		javaColecoes.getAulas().add(new Aula("Trabalhando com Arraylist", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleções", 22));

		System.out.println(javaColecoes.getAulas());

		// para mudar uma lista de leitura , nescessario atribuir há uma nova lsita,
		// assim orderna-la
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);

		List<Aula> aulas = new ArrayList<>(aulasImutaveis);

		Collections.sort(aulas);
		System.out.println(aulas);

		System.out.println(javaColecoes.getTempoTotal());

		System.out.println(javaColecoes);

	}

}
