import java.util.Scanner;

public class Secao10_Exercicio1 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		
		int n = src.nextInt();
		int [] vetorInt = new int[n];
		int numero;
		
		for (int i = 0; i < vetorInt.length; i++) {
			System.out.print("Digite um numero: ");
			numero = src.nextInt();
			vetorInt[i] = numero;
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for (int i = 0; i < vetorInt.length; i++) {
			if (vetorInt[i] < 0) {
				System.out.println(vetorInt[i]);
			}
		}

		src.close();
		
	}
}
