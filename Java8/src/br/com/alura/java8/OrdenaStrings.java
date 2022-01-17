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
		Comparator<String> comparador = new ComparadorPorTamnaho();
		
		//Collections.sort(palavras, comparador);
		palavras.sort(comparador);// n�o precisa ser no colletions 
		System.out.println(palavras);
		
//		// foreach moo antigo
//		for (String p : palavras) {
//			System.out.println(p);
//		}
	
		//nova maneira cosnumdor � uma nova de iterar 
		Consumer<String> cosumidor = new imprimeNaLinha();
		palavras.forEach(cosumidor);
		
		
		
	}

}

class imprimeNaLinha implements Consumer<String>{

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
	
}


class ComparadorPorTamnaho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length())
			return -1;
		if(s1.length() > s2.length())
			return 1;
		return 0;
	}
	
}