package br.com.cursos.alura;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções de java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleções", 22));
		
		Aluno a1 = new Aluno("Noemi Oliveira Jacintho", 221011);
		Aluno a2 = new Aluno("Lucas Oliveria Jacintho", 220012);
		Aluno a3 = new Aluno("Luciana Takemoto Yamada", 220113);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		/*
		 * Após usar o 
		 * public Set<Aluno> getAlunos() {
				return Collections.unmodifiableSet(alunos);
				}
			em aluno na clasee curso não é possivel mais adicionar pois a lsita se otrna apenas de visualização 
		
			Aluno a3 = new Aluno("Lucia Takemoto Yamada", 270113);
		*/
		// mostrnados todos os alunos
		
		System.out.println("Todos os alunos matriculados: ");
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
//		javaColecoes.getAlunos().forEach(a ->{
//			System.out.println(a);
//		});
		
		System.out.println("O aluno" + a1 + " está matriculado? "); 
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		
		Aluno oliveira = new Aluno("Lucas Oliveria Jacintho", 220012);
		System.out.println("E esse Olivera está matriculado? ");
		System.out.println(javaColecoes.estaMatriculado(oliveira));
		
//		System.out.println("O aluno Oliveira é igual ao aluno a2? ");
//		System.out.println(a2 == oliveira);
		
		System.out.println("O aluno Oliveira é Equals ao aluno a2? ");
		System.out.println(a2.equals(oliveira));
		
		System.out.println(a2.hashCode() == oliveira.hashCode());
	}

}
