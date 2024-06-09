package curso_Java_udemy;

import java.util.Locale;
import java.util.Scanner;

import entidades_exercicio1.Rectangle;

public class Secao8_Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		
		rectangle.width = src.nextDouble();
		rectangle.height = src.nextDouble();
		
		System.out.println("AREA = " + rectangle.Area());
		System.out.println("PERIMETER = " + rectangle.Perimeter());
		System.out.println("DIAGONAL = " + rectangle.Diagonal());
		
		src.close();
		

	}

}
