import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		Conta cliente;
				
		System.out.printf("Enter account number: ");
		int numeroConta = src.nextInt();
		//para consumir a linha pendente após a leitura do int:
		src.nextLine();
	
		System.out.printf("Enter account holder: ");
		String nomeCliente = src.nextLine();
		
		System.out.printf("Is there na initial deposit (y/n)? ");
		char resposta = src.next().charAt(0);
				
		if (resposta == 'y') {
			System.out.printf("Enter initial deposit value: ");
			double depositoInicial = src.nextDouble();
			
			cliente = new Conta(numeroConta, nomeCliente, depositoInicial);
			
			
		} else {
			cliente = new Conta(numeroConta, nomeCliente);
			
		}
		
		System.out.println("\nAccount data: ");
		System.out.println(cliente);
		
		
		System.out.printf("\nEnter a deposit value: ");
		double deposito = src.nextDouble();
		cliente.deposito(deposito);
		System.out.println("Updated account data:");
		System.out.println(cliente);
		
		System.out.println("\nEnter a withdraw value: ");
		double saque = src.nextDouble();
		cliente.saque(saque);
		System.out.println("Updated account data:");
		System.out.println(cliente);
		
		src.close();
		
	}

}
