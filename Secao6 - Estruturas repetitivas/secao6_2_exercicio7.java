package curso_Java_udemy;

import java.util.Scanner;

public class secao6_2_exercicio7 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner (System.in);
		
		int n = src.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));
		}
		
		src.close();

	}

}
