package curso_Java_udemy;
import java.util.Scanner;
import java.util.Locale;

public class secao4_exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int numeroFunc, horasTrab;
		double valorHora;
		
		//o programa retorna o número do funcionário, a quantidade de horas trabalhadas e seu salário
		numeroFunc = sc.nextInt();
		horasTrab = sc.nextInt();
		valorHora = sc.nextFloat();
		
		System.out.println("NUMBER = " + numeroFunc);
		System.out.printf("SALARY = U$ %.2f%n", (double) horasTrab * valorHora);
		
		sc.close();
		

	}

}
