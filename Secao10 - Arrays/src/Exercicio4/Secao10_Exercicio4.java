import java.util.Locale;
import java.util.Scanner;

public class Secao10_Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		
		int qtNumeros = src.nextInt();
		int vetor[] = new int[qtNumeros];
		int numero;
		int qtPares = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite um numero: ");
			numero = src.nextInt();
			vetor[i] = numero;
		}
		
		System.out.println("\nNUMEROS PARES:");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
				qtPares++;
			}
		}
		
		System.out.print("\n\nQUANTIDADE DE PARES = ");
		System.out.print(qtPares);
		
		src.close();

	}

}
