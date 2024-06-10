package entidades;

public class Conta {
	
	private int numeroConta;
	private String nomeTitular;
	private double saldoConta;
	//constante tarifaSaque
	private static final double tarifaSaque = 5.00;
	
	//utilizando sobrecarga nos construtores
	public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		//protegendo o construtor de mudanças futuras:
		deposito(depositoInicial);
	}

	public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
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

	//número da conta não pode ser alterado
	public int getNumeroConta() {
		return numeroConta;
	}
	
	//saldo da conta altera através de depósitos e saques
	public void deposito(double valorDeposito) {
		saldoConta += valorDeposito;
	}
	
	public void saque(double valorSaque) {
		saldoConta -= valorSaque + tarifaSaque;
	}
	
	public String toString() {
		return "Account " + numeroConta + ", " + "Holder: " + nomeTitular + ", " +  "Balance: $ " + String.format("%.2f", saldoConta);  
	}
	
}
