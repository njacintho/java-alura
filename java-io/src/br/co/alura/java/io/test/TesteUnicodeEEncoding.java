package br.co.alura.java.io.test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		/*
		 * Como caracters se comportam diante de tabelas diferentes , ASCII, UTF-8, UTF-16 e windows-1252
		 */

		String s = "ç";
		System.out.println(s.codePointAt(0));
		
		
		Charset charset = Charset.defaultCharset();// defaut coforme meu sistema operacional
		System.out.println(charset.displayName());
		

		byte[] bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + ", windows-1252, ");
		String sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo); // para mostrar o carater é necessario o construtor na string
		
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + ", UTF-16, ");
		sNovo = new String(bytes, "UTF-16");
		System.out.println(sNovo);
		
		bytes = s.getBytes("UTF-8");
		System.out.print(bytes.length + ", UTF-8, ");
		sNovo = new String(bytes, "UTF-8");
		System.out.println(sNovo);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + ", US-ASCII, ");
		sNovo = new String(bytes, "US-ASCII");
		System.out.println(sNovo);
		
		
		Charset utf8 = StandardCharsets.UTF_8;
		String frase = "1º Teste novão frasã";
		byte[] bytess = frase.getBytes(utf8);
		String nFrase =	new String (bytess, utf8);
		System.out.println(nFrase);
		
	}

}
