package br.com.bytebank.banco.test;

public class TesteString {
	public static void main(String[] args) {
		
		String vazio = "  Alura  ";
		String outrovazio = vazio.trim(); //retira os espa?os
		
		
		System.out.println(vazio.isEmpty()); // analisa se a sitring est? vazia ou n?o.
		System.out.println(vazio);
		System.out.println(vazio.contains("Alu"));// verifica se tem o que busca , mas tem que ser igual respeutando leras maiusculas 
		System.out.println(outrovazio);
		
		//Crinado um objeto de forma literal
		String nome = "Alura";
		
		//String outra = nome.replace('A', 'a');//tipo char , usa aspas simples, troca a primeira que aponta pela segunda 
		
		
		// uma String n?o pode ser alterada ela nasceu assim e ficara assim , ? imut?vel, para altera a String precisa criar outra String e alterar
		
		// ? a mesma coisa que: String sobrenome = new String("Alura");
		
		//nome.toLowerCase(); //n?o altera
		// para olterar necssario criar nova string
		
		//String nomeia = nome.toUpperCase();
		
		//System.out.println(nome);
		
		//System.out.println(nomeia);
		
		//char c = nome.charAt(2); //mostra o que est? na posi??o
		//System.out.println(c);
		
		//int pos = nome.indexOf("ur");// devolve a prineira posi??o 
		//System.out.println(pos);
		
//		String sub = nome.substring(1, 4); // a substring voce diz por onde quer comce?ar ou terminar, mostra
//		System.out.println(sub);
		
		System.out.println(nome.length());
		
		for(int i = 0; i < 5 ; i++) {
			System.out.println(nome.charAt(i));//Com o nome.chart imprime a letra e n?o o numero da posis??o
		}
		
	}

}
