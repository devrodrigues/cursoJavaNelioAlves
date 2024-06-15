

import java.util.Locale;
import java.util.Scanner;

public class Secao10_Exercicio9 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int pessoas = src.nextInt();
		String nome[] = new String[pessoas];
		int idade[] = new int[pessoas];
		
		int verificaMaisVelho = 0;
		String maisVelho = "";
		
		for(int i = 0; i < pessoas; i++) {
			System.out.println("Dados da" + i + " a pessoa:");
			System.out.print("Nome: ");
			nome[i] = src.next();
			idade[i] = src.nextInt();
			
			if(verificaMaisVelho < idade[i]) {
				maisVelho = nome[i];
				verificaMaisVelho = idade[i];
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: ");
		System.out.print(maisVelho);
		
		src.close();

	}

}
