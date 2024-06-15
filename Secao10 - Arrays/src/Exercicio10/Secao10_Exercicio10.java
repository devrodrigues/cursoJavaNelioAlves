import java.util.Locale;
import java.util.Scanner;

public class Secao10_Exercicio10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int alunos = src.nextInt();
		String nome[] = new String[alunos];
		double notaPrimeiro[] = new double[alunos];
		double notaSegundo[] = new double[alunos];
		
		for(int i = 0; i < alunos; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
			src.nextLine();
			nome[i] = src.nextLine();
			notaPrimeiro[i] = src.nextDouble();
			notaSegundo[i] = src.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		for(int i = 0; i < alunos; i++) {
			if (((notaPrimeiro[i] + notaSegundo[i]) / 2 >= 6.0)) {
				System.out.println(nome[i]);
			}
		}
		
		src.close();
		
	}

}
