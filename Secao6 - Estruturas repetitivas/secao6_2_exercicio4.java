package curso_Java_udemy;

import java.util.Scanner;

public class secao6_2_exercicio4 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner (System.in);
		
		int n = src.nextInt();
		int a, b;
		
		for (int i = 0; i < n; i++) {
			a = src.nextInt();
			b = src.nextInt();
			
			if (b == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.println((double) a / b);
			}
		}
		
		src.close();

	}

}
