import java.util.Locale;
import java.util.Scanner;

public class Secao10_Exercicio7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int elementos = src.nextInt();
		double vetor[] = new double[elementos];
		double soma = 0.0;
		double media;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite um numero: ");
			vetor[i] = src.nextDouble();
			soma += vetor[i];
		}
		
		System.out.printf("\nMEDIA DO VETOR = ");
		media = soma / vetor.length;
		System.out.print(media);
		
		System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		
		
		src.close();

	}

}
