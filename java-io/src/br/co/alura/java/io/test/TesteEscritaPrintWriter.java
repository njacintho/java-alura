package br.co.alura.java.io.test;


import java.io.IOException;
import java.io.PrintWriter;


public class TesteEscritaPrintWriter {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de saída com arquivo, ele cria um arquivo novo
		
//		OutputStream fos = new FileOutputStream("Loren2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("loren4.txt"));// enxugnado mais ainda o código
//		PrintStream ps = new PrintStream("Loren5.txt"); maneira mais simples
//		PrintStream ps = new PrintStream(new File("Loren5.txt")); mais compelto o caminho 
		
		PrintWriter pw = new PrintWriter("Loren5.txt", "UTF-8"); //método mais novo , porem igual ao PrintStream
		pw.println("Àquila não é nada...The standard Lorem Ipsum passage, used since the 1500s");
		pw.println();
		pw.println("Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.  xii baaaHHHHHH");
		

		
		pw.close(); // fecha a instrução aberta
	}

}
