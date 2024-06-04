package entidades_exercicio2;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public void IncreaseSalary(double percentage) {
		grossSalary = grossSalary * (double) (percentage / 100 + 1);
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f %n", NetSalary());
	}
	
}
