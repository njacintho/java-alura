package br.com.cursos.alura;

public class TestaBuscaAlunos {
	
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
		
		
		System.out.println("Quem é o aluno com a matricula 220113? ");
		Aluno aluno = javaColecoes.buscaMatriculado(220114);
		System.out.println("Aluno: " + aluno);
		
	}

}
