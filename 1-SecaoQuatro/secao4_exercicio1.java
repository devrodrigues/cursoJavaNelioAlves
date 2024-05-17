package curso_Java_udemy;
import java.util.Scanner;
import java.util.Locale;


public class secao4_exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int a, b;
		
		//digite dois números inteiros para que seja retornada a soma entre eles
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("SOMA = " + (a + b));
		
		sc.close();
	}

}
