
public class TestaValores {
	
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		
		segundo = primeiro;
		primeiro = 10; // essa valor n�o ser� atribuido ao segundo 
		System.out.println(segundo);		
		
	}

}
