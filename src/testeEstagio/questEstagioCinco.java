package testeEstagio;

import java.util.Scanner;

public class questEstagioCinco {

	public static void main(String[] args) {
		/*input de texto*/
		Scanner input = new Scanner (System.in);
		System.out.println("Digite sua frase: ");
		String entradaString = input.nextLine();
		String saidaString = inverteString(entradaString);
		System.out.println(entradaString);
		System.out.println(saidaString);
		
		
	}

public static String inverteString(String str) {
	char [] caracteres = str.toCharArray();
	int inicio = 0;
	int fim = str.length() -1;
	
	while(inicio < fim) {
		char temp = caracteres[inicio];
		caracteres[inicio] = caracteres[fim];
		caracteres[fim] = temp;
		inicio++;
		fim--;
	}
	
	return new String(caracteres);
}	
	
}
