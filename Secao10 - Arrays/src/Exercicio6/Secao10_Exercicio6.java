import java.util.Locale;
import java.util.Scanner;

public class Secao10_Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int qtValores = src.nextInt();
		int vetorA[] = new int[qtValores];
		int vetorB[] = new int[qtValores];
		int vetorC[] = new int[qtValores];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = src.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i < vetorB.length; i++) {
			vetorB[i] = src.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for(int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorC[i]);
		}
		
		src.close();

	}

}
