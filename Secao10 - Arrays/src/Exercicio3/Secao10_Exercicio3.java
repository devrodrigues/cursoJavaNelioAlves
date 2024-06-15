import java.util.Locale;	
import java.util.Scanner;

import entidades.Pessoa;

public class Secao10_Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = src.nextInt();
		
		Pessoa p [] = new Pessoa[n];
		String nome;
		int idade;
		double altura;
		
		double somaAltura = 0.0;
		double alturaMedia;
		int menoresDesesseis = 0;
		double porcentMenores;
		
		for(int i = 0; i < p.length; i++) {
			System.out.println("Dados da "+ (i + 1) + "a pessoa:");
			
			System.out.print("Nome: ");
			nome = src.next();
			System.out.print("Idade: ");
			idade = src.nextInt();
			System.out.print("Altura: ");
			altura = src.nextDouble();
			
			p[i] = new Pessoa(nome, idade, altura);
		}
		
		System.out.print("\nAltura média: ");
		
		for(int i = 0; i < p.length; i++) {
			somaAltura += p[i].getAltura();
			
			if(p[i].getIdade() < 16) {
				menoresDesesseis += 1;
			}
		}
		
		alturaMedia = somaAltura / p.length;
		System.out.printf("%.2f%n", alturaMedia);
		
		System.out.print("Pessoas com menos de 16 anos: ");
		porcentMenores = (double) menoresDesesseis / p.length * 100;
		System.out.println(porcentMenores + "%");
		
		for(int i = 0; i < p.length; i++) {
			if(p[i].getIdade() < 16) {
				System.out.println(p[i].getName());
			}
		}
		
		
		src.close();

	}

}
