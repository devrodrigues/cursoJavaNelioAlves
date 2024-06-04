package curso_Java_udemy;

import java.util.Locale;
import java.util.Scanner;

import entidades_exercicio3.Student;

public class Secao8_Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner (System.in);
		
		Student student = new Student();
		
		student.name = src.nextLine();
		student.firstTri = src.nextDouble();
		student.secondTri = src.nextDouble();
		student.thirdTri = src.nextDouble();
		
		System.out.println(student);
		
		src.close();

	}

}
