package br.co.alura.java.io.test;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"), StandardCharsets.ISO_8859_1.name());
		
		//Scanner scanner = new Scanner(new File("contas.csv"), StandardCharsets.UTF_8.name());
		while(scanner.hasNext()) {
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US); // mesmo que o sistema operacional esteja configurado em PT vai converter em US
			
			linhaScanner.useDelimiter(";"); // delimitador retirado
			
			String tipoConta  = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			//String valorFormatado = String.format(new Locale("pt", "BR"), "%s : %04d - %08d, %13s: %07.2f", tipoConta, agencia, numero, titular, saldo);
			//System.out.println(valorFormatado);
			
			System.out.format(new Locale("pt", "BR"), "%s : %04d - %08d, %13s: %07.2f %n", tipoConta, agencia, numero, titular, saldo);
			
			
			linhaScanner.close();
			
//			String[]  valores = linha.split(";");// retira o ponto e vrigula
//			System.out.println(valores[1]);
			//System.out.println(Arrays.toString(valores));
			 
		}
		scanner.close();
	}

}
