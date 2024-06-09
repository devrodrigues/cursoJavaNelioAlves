package curso_Java_udemy;

import java.util.Scanner;

public class secao6_2_exercicio2 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner (System.in);

		int n, x;
		int in = 0;
		int out = 0;
		
		n = src.nextInt();
		
		
		for (int i = 0; i < n; i++) {
			
			x = src.nextInt();
			
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
			
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		src.close();
	}

}
