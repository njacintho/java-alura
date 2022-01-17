package br.com.alura.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

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
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		System.out.println(palavras);
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
		palavras.forEach(s -> System.err.println(s));

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