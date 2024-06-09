package curso_Java_udemy;

import java.util.Scanner;

public class secao6_2_exercicio5 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		int n = src.nextInt();
		int fatorial = n;
		
		if (n != 0) {
			for (int i = n; i > 1; i--) {
				fatorial = fatorial * (i - 1);
				
			}
		} else {
			fatorial = 1;
		}
		
		
		
		System.out.println(fatorial);
		
		src.close();
		

	}

}
