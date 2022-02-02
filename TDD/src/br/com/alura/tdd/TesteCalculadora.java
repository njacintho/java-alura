package br.com.alura.tdd;


public class TesteCalculadora {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		double soma = calc.somar(3, 2);
		System.out.println(soma);
		
		soma = calc.somar(3, 0);
		System.out.println(soma);
		
		soma = calc.somar(0, 0);
		System.out.println(soma);
		
		soma = calc.somar(3, -2);
		System.out.println(soma);
		

	}

}
