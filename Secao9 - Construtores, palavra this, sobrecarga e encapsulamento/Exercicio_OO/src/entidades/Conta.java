package entidades;

public class Conta {
	
	private int numeroConta;
	private String nomeTitular;
	private double saldoConta;
	//constante tarifaSaque
	private static final double tarifaSaque = 5.00;
	
	//utilizando sobrecarga nos construtores
	public Conta(int numeroConta, String nomeTitular, double saldoConta) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldoConta = saldoConta;
	}

	public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	public Conta() {
		
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}

	//nome do cliente pode ser alterado
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	//número da conta não pode ser alterado
	public int getNumeroConta() {
		return numeroConta;
	}
	
	//saldo da conta altera através de depósitos e saques
	public void Deposito(double valorDeposito) {
		saldoConta = saldoConta + valorDeposito;
	}
	
	public void Saque(double valorSaque) {
		saldoConta = saldoConta - valorSaque - tarifaSaque;
	}
	
	public String toString() {
		return "Account " + numeroConta + ", " + "Holder: " + nomeTitular + ", " +  "Balance: $ " + String.format("%.2f", saldoConta);  
	}
	
}
