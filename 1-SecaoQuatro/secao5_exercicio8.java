package curso_Java_udemy;

import java.util.Locale;
import java.util.Scanner;

public class secao5_exercicio8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner (System.in);
		
		double salario, ir;
		
		salario = src.nextDouble();
		
		if (salario <= 2000.00) {
			System.out.println("Isento");
			
		} else if (salario > 2000.00 && salario <= 3000.00) {
			ir = (salario - 1000.00) * 0.08;
			 
			System.out.printf("R$ %.2f%n", ir);
			
		} else if (salario > 3000.00 && salario <= 4500.00) {
			ir = (salario - 3000.00) * 0.18 + 80.00;
			
			System.out.printf("R$ %.2f%n", ir);
			
		} else {
			ir = (salario - 4500.00) * 0.28 + 350.00;
			
			System.out.printf("R$ %.2f%n", ir);
			
		}
		
		src.close();

	}

}
