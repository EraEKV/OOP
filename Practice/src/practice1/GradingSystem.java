package practice1;

import java.util.Scanner;


public class GradingSystem {
	private static String checkGrade(int grade) {
		if(grade < 50) return "F";
		String[] grades = {"C-", "C", "C+", "B-", "B", "B+", "A-", "A"};
		return grades[(grade - 50) / 5 - 1];
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int grade = input.nextInt();
		
		System.out.println(checkGrade(grade));
		
		input.close();
	}
}
