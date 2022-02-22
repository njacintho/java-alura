package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	// Teste de lógica cerificando se o bonus é zero
	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
	//	BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));
		
	//	assertEquals(BigDecimal.ZERO, bonus);
	//	assertEquals(new BigDecimal("0.00"), bonus);

		//testando uma exception 
		
//		assertThrows(IllegalArgumentException.class,
//				() -> service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000"))));
//		
		try {
			service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));
			fail("Não deu exception!");
		} catch (Exception e) {
			assertEquals("Funcionário com salario maior que R$ 10000,00 não pode receber bonus.", e.getMessage());
		}
	}
	
	// Teste de lógica cerificando que o 10% vai ser pago porque está abaixo de 1000
	@Test
	void bonusDeveriaSerdezPorcentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("2500")));
		
		assertEquals(new BigDecimal("250.00"), bonus);
		
		//Outra maneira é obrigando a ter duas casass decimais na classe Bonus SERVICE no return  
	}
	
	// Teste de lógica cerificando se o bonus é zero
	@Test
	void bonusDeveriaSerDezPorcentoSeOSalarioFor10000() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000")));

		assertEquals(new BigDecimal("1000.00"), bonus);
	}

}
