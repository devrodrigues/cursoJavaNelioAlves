import java.util.Locale;
import java.util.Scanner;

public class Secao10_Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = src.nextInt();
		double [] vetorR = new double[n];
		double numero;
		double soma = 0.0;
		double media = 0.0;
		
		for(int i = 0; i < vetorR.length; i++) {
			System.out.print("Digite um numero: ");;
			numero = src.nextDouble();
			vetorR[i] = numero;
		}
		
		System.out.print("\nVALORES = ");
		for(int i = 0; i < vetorR.length; i++) {
			System.out.print(vetorR[i]);
			soma += vetorR[i];
			System.out.print(" ");
		}
		
		media = soma / vetorR.length;
		
		System.out.print("\nSOMA = ");
		System.out.printf("%.2f%n", soma);
		System.out.print("MEDIA = ");
		System.out.printf("%.2f%n", media);
		
		src.close();

	}

}
