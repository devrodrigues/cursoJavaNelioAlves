package curso_Java_udemy;
import java.util.Scanner;

public class secao4_exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;

		//digite quatro números inteiros, fazendo o cálculo de diferença
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diferenca = a * b - c * d;
		
		System.out.println("DIFERENCA = " + diferenca);		
		
		sc.close();

	}

}
