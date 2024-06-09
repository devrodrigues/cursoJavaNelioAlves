package curso_Java_udemy;

import java.util.Locale;
import java.util.Scanner;

public class secao6_2_exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner (System.in);
		
		int n = src.nextInt();
		double a, b, c, mediaPonderada;
		
		for (int i = 0; i < n; i++) {

			a = src.nextDouble();
			b = src.nextDouble();
			c = src.nextDouble();
			
			mediaPonderada = (a * 2 + b * 3 + c * 5) / 10;
			
			System.out.printf("%.1f %n", mediaPonderada);
			
		}
		
		src.close();
		
	}

}
