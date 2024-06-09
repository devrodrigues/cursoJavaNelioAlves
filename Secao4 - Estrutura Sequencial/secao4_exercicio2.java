package curso_Java_udemy;
import java.util.Locale;
import java.util.Scanner;


public class secao4_exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double raio, pi, areaCirculo;
		
		//digite o raio para que seja retornada a área do círculo
		raio = sc.nextDouble();
		pi = 3.14159; 
		
		areaCirculo = pi * Math.pow(raio, 2);
		
		
		System.out.printf("%.4f%n", areaCirculo);
		
		sc.close();

	}

}
