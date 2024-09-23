package lab1;

import practice2.Student;

import java.util.Scanner;
import java.util.Vector;

public class GradeBookTest {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Course oop = new Course("CSCI1204", "Object-oriented Programming and design");
		
		GradeBook pakita = new GradeBook(oop);
		
		Vector<Student> students = new Vector<>();
		
		for (int i = 0; i < 3; i++) {
			Student student = new Student(Character.toString((char) 65 + i));
			students.add(student);
			pakita.addStudent(student);
		}
		
		pakita.displayMessage();
		
		System.out.println("Enter the grades of the students: ");
		
		for(int i = 0; i < 3; i++) {
			System.out.print("Student " + students.get(i).getName() + ": ");
			pakita.setGrade(students.get(i), in.nextInt());
		}
		
		pakita.displayGradeReport();
		
		pakita.outputBarChart();
		
		in.close();
	}
}
