package testeEstagio;
import java.util.Scanner;

public class questEstagioDois {
	// cria sequencia de bonifacci para comparação do resultado
	/*static int fiboTeste(int n) {
		int fibo = 0;
		int anter = 0;
		
		for (int i = 1; i<= n; i++) {
			
			if (i == 1) {
				fibo = 1;
				anter = 0;
				} else {
					fibo += anter;
					anter = fibo - anter;
				}
		}
		return fibo;
	}
	*/
	
	 public static boolean verificarFibonacci(int num) {
	        int primeiro = 0;
	        int segundo = 1;
	        while (primeiro <= num) {
	            if (primeiro == num) {
	                return true;
	            }
	            int proximo = primeiro + segundo;
	            primeiro = segundo;
	            segundo = proximo;
	        }
	        return false;
	 }
	
	
	public static void main(String[] args) {
		int comp = 0;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		comp = input.nextInt();
		
		 if (verificarFibonacci(comp)) {
	            System.out.println(comp + " pertence à sequência de Fibonacci.");
	        } else {
	            System.out.println(comp + " não pertence à sequência de Fibonacci.");
	        }
		
		
		 /*mosta o resultado dos 23 primeiros numeros sequência de Fibonacci, e utilizado para comparação da resposta
		for (int i = 0; i < 23; i++) {
           		* System.out.println("(" + i + "):" + questEstagioDois.fiboTeste(i));
			}
			*/
}
}