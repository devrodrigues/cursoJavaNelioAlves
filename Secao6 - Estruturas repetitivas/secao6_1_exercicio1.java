package curso_Java_udemy;

import java.util.Scanner;

public class secao6_exercicio1 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		int n = src.nextInt();
		
		while (n != 2002) {
			
			System.out.println("Senha Invalida");
			n = src.nextInt();
		}
		
	
		System.out.println("Acesso Permitido");

		
		src.close();
		
		
	}

}
