package entidades;

import java.util.Locale;
import java.util.Scanner;

public class Secao10_Exercicio11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int qtPessoas = src.nextInt();
		double altura[] = new double[qtPessoas];
		char genero[] = new char[qtPessoas];
		double menorAltura = 0.0;
		double maiorAltura = 0.0;
		double somaAlturaMulheres = 0.0;
		int qtAlturaMulheres = 0;
		int qtHomens = 0;
		
		for(int i = 0; i < qtPessoas; i++) {
			System.out.printf("Altura da " + (i + 1) + "a pessoa: ");
			altura[i] = src.nextDouble();
			System.out.printf("Genero da " + (i + 1) + "a pessoa: ");
			genero[i] = src.next().charAt(0);
		}
		
		for(int i = 0; i < qtPessoas - 1; i++) {
			if(i == 0) {
				menorAltura = altura[i];
				maiorAltura = altura[i + 1];
			} else if(menorAltura > altura[i + 1]) {
				menorAltura = altura[i + 1];
			} else if (maiorAltura < altura[i]){
				maiorAltura = altura[i];
			}
		}
		
		for(int i = 0; i < qtPessoas; i++) {
			if(genero[i] == 'F') {
				somaAlturaMulheres += altura[i];
				qtAlturaMulheres++;
			} else {
				qtHomens++;
			}
		}
		
		System.out.print("Menor altura = ");
		System.out.print(menorAltura);
		System.out.print("\nMaior altura = ");
		System.out.print(maiorAltura);
		System.out.print("\nMedia das alturas das mulheres = ");
		System.out.printf("%.2f%n", somaAlturaMulheres / qtAlturaMulheres);
		System.out.print("Numero de homens = ");
		System.out.print(qtHomens);
		
		src.close();
		
	}

}
