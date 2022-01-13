package br.com.cursos.alura;

import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionarios>{

	@Override
	public int compare(Funcionarios funcionarios, Funcionarios outroFuncionario) {

		return funcionarios.getIdade() - outroFuncionario.getIdade();
	}

	

}
