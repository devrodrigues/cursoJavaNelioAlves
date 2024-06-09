package entidades_exercicio3;

public class Student {
	
	public String name;
	public double firstTri;
	public double secondTri;
	public double thirdTri;
	
	public double FinalGrade() {
		return firstTri + secondTri + thirdTri;
	}
	
	public String TestGrade() {
		if (FinalGrade() >= 60.00) {
			return "PASS";
		} else {
			return "FAILED" + "\nMISSING " + String.format("%.2f", (100.00 - FinalGrade())) + " POINTS";
		}
	}
	
	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f%n", FinalGrade()) + TestGrade();
	}
	
}
