package curso_Java_udemy;

import java.util.Scanner;

public class secao6_2_exercicio1 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner (System.in);
		
		int x = src.nextInt();
		
		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		src.close();
		
	}

}
