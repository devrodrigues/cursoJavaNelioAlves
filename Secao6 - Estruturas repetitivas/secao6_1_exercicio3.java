package curso_Java_udemy;

import java.util.Scanner;

public class secao6_exercicio3 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int combustivel = src.nextInt();
		
		while (combustivel != 4) {
			
			if (combustivel == 1) {
				alcool += 1;
				
			} else if (combustivel == 2){
				gasolina += 1;
				
			} else if (combustivel == 3) {
				diesel += 1;
				
			} 
			
			combustivel = src.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		src.close();

	}

}
