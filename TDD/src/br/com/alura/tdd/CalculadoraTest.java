package br.com.alura.tdd;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	//Não funciona com double.. nescessario verificar
	
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(4, 5);
		
		Assert.assertEquals(9,soma);

	}
}
