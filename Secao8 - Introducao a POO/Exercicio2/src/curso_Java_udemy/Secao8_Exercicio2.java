package curso_Java_udemy;

import java.util.Locale;
import java.util.Scanner;

import entidades_exercicio2.Employee;

public class Secao8_Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		double increase;
		
		Employee employee = new Employee();
		
		System.out.println("Name:");
		employee.name = src.nextLine();
		
		System.out.println("Gross salary:");
		employee.grossSalary = src.nextDouble();
		
		System.out.println("Tax:");
		employee.tax = src.nextDouble();
		
		System.out.println("Employee: " + employee.name + ", $ " + String.format("%.2f%n", employee.NetSalary()));
		
		System.out.println("Wich percentage to increase salary?");
		increase = src.nextDouble();
		employee.IncreaseSalary(increase);
		
		System.out.println(employee);
		
		src.close();

	}

}
