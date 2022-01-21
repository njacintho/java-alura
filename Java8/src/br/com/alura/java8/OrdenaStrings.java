package br.com.alura.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura online");
		palavras.add("editora casa do codigo");
		palavras.add("Caelum");

		// modo antigo para ordenar de outra forma.
//		Comparator<String> comparador = new ComparadorPorTamnaho();

		// Collections.sort(palavras, comparador);

//		palavras.sort(comparador);// não precisa ser no colletions
//		System.out.println(palavras);

//		palavras.sort((s1, s2) -> {
//			if (s1.length() < s2.length())
//				return -1;
//			if (s1.length() > s2.length())
//				return 1;
//			return 0;
//		});

//		Interface funcioanal 
//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		palavras.sort(Comparator.comparing(s -> s.length())); // palavras ordene comaprando s com s.length
		palavras.sort(Comparator.comparing(String ::length)); 
		
		
		// é a mesma coisa que palavras.sort(Comparator.comparing(s -> s.length())); // palavras ordene comaprando s com s.length
//		Comparator<String> comparador = Comparator.comparing(s -> s.length());
//		palavras.sort(comparador);
		
//		Function<String, Integer> funcao = s -> s.length();
//		Comparator<String> comparador = Comparator.comparing(funcao);
//		palavras.sort(comparador);
//		
		
//		esta forma equivale a palavras.sort(Comparator.comparing(s -> s.length()));
//		cria a funcção , compara e utiliza o método sort.
		Function<String, Integer> funcao = new Function<String, Integer>() {

			@Override
			public Integer apply(String s) {
				return s.length();
			}
			
		};
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		

		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println(palavras);

//		new Thread (new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("Executando um Runnable");
//			}
//		}).start();

		new Thread(() -> System.out.println("Executando um Runnable")).start();

//		// foreach modo antigo
//		for (String p : palavras) {
//			System.out.println(p);
//		}

		// nova maneira cosnumdor é uma nova de iterar
//		Consumer<String> cosumidor = new imprimeNaLinha();
//		Consumer<String> cosumidor = new Consumer<String>() {
//
//			@Override
//			public void accept(String s) {
//				System.err.println(s);
//				
//			}
//		};

//  Classe anonima 

//		palavras.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String s) {
//				System.err.println(s);
//
//			}
//		});

		Consumer<String> impressor = s -> System.out.println(s);
		palavras.forEach(impressor);

//		Lambda 
		palavras.forEach(System.out::println); // method reference

	}

}

//class imprimeNaLinha implements Consumer<String>{
//
//	@Override
//	public void accept(String s) {
//		System.out.println(s);
//	}
//	
//}

//class ComparadorPorTamnaho implements Comparator<String> {
//
//	@Override
//	public int compare(String s1, String s2) {
//		if (s1.length() < s2.length())
//			return -1;
//		if (s1.length() > s2.length())
//			return 1;
//		return 0;
//	}

//}
