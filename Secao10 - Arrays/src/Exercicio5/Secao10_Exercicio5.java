import java.util.Locale;
import java.util.Scanner;

public class Secao10_Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		System.out.printf("Quantos numeros voce vai digitar? ");
		int qtNumeros = src.nextInt();
		double vetor[] = new double[qtNumeros];
		double numero;
		double maiorValor = 0.0;
		int posicaoMaiorValor = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			numero = src.nextDouble();
			vetor[i] = numero;
		}
		
		for(int i = 0; i < vetor.length - 1; i++) {
			if(maiorValor < vetor[i]) {
				maiorValor = vetor[i];
				posicaoMaiorValor = i;
			}
		}
		
		System.out.print("\nMAIOR VALOR =  ");
		System.out.print(maiorValor);
		
		System.out.print("\nPOSICAO DO MAIOR VALOR = ");
		System.out.print(posicaoMaiorValor);
		
		src.close();

	}

}
