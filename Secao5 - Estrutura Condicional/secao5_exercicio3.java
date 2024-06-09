package curso_Java_udemy;

import java.util.Scanner;

public class secao5_exercicio3 {

	public static void main(String[] args) {

		Scanner src = new Scanner(System.in);
		
		int a, b;
		
		a = src.nextInt();
		b = src.nextInt();
		
		if (Math.max(a, b) % Math.min(a, b) == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao multiplos");
		}
		
		src.close();
		
	}

}
