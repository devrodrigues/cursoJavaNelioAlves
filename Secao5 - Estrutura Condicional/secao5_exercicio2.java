package curso_Java_udemy;

import java.util.Scanner;

public class secao5_exercicio2 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		int a;
		
		a = src.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		src.close();

	}

}
