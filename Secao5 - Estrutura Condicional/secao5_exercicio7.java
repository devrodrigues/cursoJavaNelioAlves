package curso_Java_udemy;

import java.util.Locale;
import java.util.Scanner;

public class secao5_exercicio7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner (System.in);
		
		double x, y;
		
		x = src.nextDouble();
		y = src.nextDouble();
		
		if(x > 0 && y > 0) {
			System.out.println("Q1");
			
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
			
		} else if(x < 0 && y > 0) {
			System.out.println("Q2");
			
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
			
		} else {
			System.out.println("Origem");
		}
		
		src.close();

	}

}
