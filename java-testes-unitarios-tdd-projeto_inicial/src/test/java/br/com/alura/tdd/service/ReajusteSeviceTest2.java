package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteSeviceTest2 {

	private ReajusteService service;
	private Funcionario funcionario;
	
	@BeforeEach   // antes dele rodart os teste elew puxa esse método antes de fazer os outros testes
	public void inicializar() {
		this.service = new ReajusteService();
		this.funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
	}

	@Test
	void reajustedeveriaserDeTrePorcentoQuandoADesejar() {
	//	inicializar();
		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());

	}

	@Test
	void reajustedeveriaserDeQuinzePorcentoQuandoBom() {
	//	inicializar();
		service.concederReajuste(funcionario, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}

	@Test
	void reajustedeveriaserDeVinteePorcentoQuandoOtimo() {
	//	inicializar();
		service.concederReajuste(funcionario, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}

}
