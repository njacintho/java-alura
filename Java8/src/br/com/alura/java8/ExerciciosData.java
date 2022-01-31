package br.com.alura.java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ExerciciosData {

	
	public static void main(String[] args) {
		
		LocalDate dataHoje = LocalDate.now();
		
		System.out.println(dataHoje);
		
		LocalDate dataFutura = LocalDate.of(2062, Month.JANUARY, 8);
		
		
		Period quantoAnosFalta = Period.between(dataHoje, dataFutura);
		
		System.out.println(quantoAnosFalta.getYears() + " anos, que faltam.");
		
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(dataHoje.format(formatar));
		
		
	}
}
