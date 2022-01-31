package br.com.alura.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {


		LocalDate hoje = LocalDate.now();
		
		System.out.println("Hoje é " + hoje);
		
		LocalDate olimpiadasParis = LocalDate.of(2024, Month.JULY, 26);
		
		int anos = olimpiadasParis.getYear() - hoje.getYear();
		System.out.println("Faltam " + anos + " anos, para próxima olimpidas");
		
		Period periodo = Period.between(hoje, olimpiadasParis);
		System.out.println("Faltam " + periodo.getDays() + " dias, " + periodo.getMonths() + " meses, "
		+ periodo.getYears() + " anos, para as olimpaidas de Paris");
		
		
		LocalDate proximaOlimpiadas =  olimpiadasParis.plusYears(4);
		
		System.out.println(proximaOlimpiadas);
		
		DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String dataFormatada = proximaOlimpiadas.format(formatarData);
		
		
		System.out.println("Próxima olimpiadas, depois de Paris será:  " + dataFormatada);
		
		DateTimeFormatter formatComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatComHoras));
		
		
		agora.toLocalDate();
		System.out.println(agora);
		
		
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println("Meu intervalo é as "+ intervalo);
	}

}
