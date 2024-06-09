package curso_Java_udemy;
import java.util.Scanner;
import java.util.Locale;

public class secao4_exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		int codUm, qtUm, codDois, qtDois, qtPecas;
		double valUnitUm, valUnitDois, valPagar;
		
		codUm = src.nextInt();
		qtUm = src.nextInt();
		valUnitUm = src.nextDouble();
		
		codDois = src.nextInt();
		qtDois = src.nextInt();
		valUnitDois = src.nextDouble();
		
		valPagar = (qtUm * valUnitUm) + (qtDois * valUnitDois);
		
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n ", valPagar);
		src.close();

	}

}
