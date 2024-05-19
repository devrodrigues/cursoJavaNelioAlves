package curso_Java_udemy;

import java.util.Scanner;

public class secao5_exercicio4 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		int a, b, duracao;
		
		a = src.nextInt();
		b = src.nextInt();
		
		if (a > b) {
			a = 24 - a;
			
			duracao = a + b;
			
			System.out.printf("O JOGO DUROU " + duracao + " HORA(S)");
		} else {
			duracao = b - a;
			
			System.out.printf("O JOGO DUROU " + duracao + " HORA(S)");
		}
		
		src.close();
		

	}

}
