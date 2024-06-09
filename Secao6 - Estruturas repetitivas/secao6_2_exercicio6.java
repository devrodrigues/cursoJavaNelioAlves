package curso_Java_udemy;

import java.util.Scanner;

public class secao6_2_exercicio6 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner (System.in);
		
		int n = src.nextInt();
		
		if (n > 0) {
			for (int i = n; i > 0; i--) {
				if (n % i == 0) {
					System.out.println(i);
				}
			}
		}
		
		
		src.close();

	}

}
