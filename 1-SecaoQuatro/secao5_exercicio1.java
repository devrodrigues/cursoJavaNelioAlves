package curso_Java_udemy;

import java.util.Scanner;

public class secao5_exercicio1 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		int a;
		
		a = src.nextInt();
		
		if(a < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");	
		}
		
		src.close();
	}

}
