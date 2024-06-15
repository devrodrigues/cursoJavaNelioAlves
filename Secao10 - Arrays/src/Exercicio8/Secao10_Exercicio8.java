import java.util.Locale;
import java.util.Scanner;

public class Secao10_Exercicio8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int elementos = src.nextInt();
		int vetor[] = new int[elementos];
		int n;
		int soma = 0;
		int qtPares = 0;
		double mediaPares = 0.0;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			n = src.nextInt();
			vetor[i] = n;
		}
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				soma += vetor[i];
				qtPares++;
			}
		}
		
		if(qtPares > 0) {
			System.out.print("MEDIA DOS PARES = ");
			mediaPares = soma / qtPares;
			System.out.print(mediaPares);
		} else {
			System.out.print("NENHUM NUMERO PAR");
		}
		
		src.close();

	}

}
