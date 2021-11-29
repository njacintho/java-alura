package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappersInteger {

	public static void main(String[] args) {
		
		int []idades = new int[5]; // primitivos
		String[] nomes = new String[5]; // referencias
		
		int idade = 29;// ele entende que n�o � um primitivo e que � um integer
		
		// AUTOBOXING E UNBOXING NA RA�A
		Integer idadeRef = Integer.valueOf(29); // me d� o valor desse primitivo, criando o objeto apartir do primitivo, AUTOBOXING 
		int valor = idadeRef.intValue(); // aqui voc� tem o objeto e est� pedindo o primitivo , UNBOXING
		
		String s = args[0]; //"10"
		
		///Integer numero = Integer.valueOf(s); | Isso � um objeto referencia
		int numero = Integer.parseInt(s); // aqui tem um m�todo que pega a String e passa para primitivo
		System.out.println(numero);
		
//		Integer idadeRef = new Integer(29);  //� o que ele faz como o tipo primitivo um wrapper
		
		
		List numeros = new ArrayList<>(); 
		numeros.add(29); // autoboxing mesma coisa que a linha 16.
		

	}

}
