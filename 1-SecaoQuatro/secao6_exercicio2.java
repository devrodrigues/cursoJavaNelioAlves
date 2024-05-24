package curso_Java_udemy;

import java.util.Scanner;

public class secao6_exercicio2 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		int x, y;
		
		x = src.nextInt();
		y = src.nextInt();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
				
				
			} else if (x > 0 && y < 0) {
				System.out.println("quarto");
				

			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");


			} else {
				System.out.println("segundo");

			}

			x = src.nextInt();
			y = src.nextInt();
			
		}
		
		src.close();

	}

}
