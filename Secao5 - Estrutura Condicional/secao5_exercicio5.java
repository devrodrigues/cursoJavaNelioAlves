package curso_Java_udemy;

import java.util.Locale;
import java.util.Scanner;

public class secao5_exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		int codigo, quantidade;
		double preco;
		
		codigo = src.nextInt();
		quantidade = src.nextInt();
		
		if (codigo == 1) {
			preco = 4.00;
			
			System.out.printf("Total: R$ %.2f%n", ((double) preco * quantidade));
		} else if (codigo == 2) {
			preco = 4.50;
			
			System.out.printf("Total: R$ %.2f%n", ((double) preco * quantidade));
		} else if (codigo == 3) {
			preco = 5.00;
			
			System.out.printf("Total: R$ %.2f%n", ((double) preco * quantidade));
		} else if (codigo == 4) {
			preco = 2.00;
			
			System.out.printf("Total: R$ %.2f%n", ((double) preco * quantidade));
		} else {
			preco = 1.50;
			
			System.out.printf("Total: R$ %.2f%n", ((double) preco * quantidade));
		}
		
		src.close();

	}

}
