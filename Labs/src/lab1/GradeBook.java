package lab1;

import practice2.Student;

import java.util.Vector;
import java.util.Map;
import java.util.HashMap;


public class GradeBook {
	private Course course;
	private Vector <Student> studentList = new Vector<>();
	private Map <Student, Integer> gradeBook = new HashMap<>();
	
	
	public GradeBook() {
		
	}
	
	public GradeBook(Course course) {
		this.course = course;
	}
	
	public GradeBook(Vector <Student> studentList) {
		this.studentList = studentList;
	}
	
	public GradeBook(Course course, Vector <Student> studentList) {
		this.studentList = studentList;
		this.course = course;
	}
	
	public double determineClassAverage() {
		int sum = 0;
		for(Student s : this.studentList) {
			Integer grade = this.gradeBook.get(s);
			
			if(grade != null) {
				sum += grade;
			}
		}
		return (double) sum / this.studentList.size();
	}
	
	public Student getStudentWithMaxGrade() {
		Student max = this.studentList.get(0);
		for(Student s : this.studentList) {
			if(this.gradeBook.get(s) > this.gradeBook.get(max)) {
				max = s;
			}
		}
		return max;
	}
	
	public Student getStudentWithMinGrade() {
		Student min = this.studentList.get(0);
		for(Student s : this.studentList) {
			if(this.gradeBook.get(s) < this.gradeBook.get(min)) {
				min = s;
			}
		}
		return min;
	}
	
	public void displayGradeReport() {
		Student min = getStudentWithMinGrade();
		Student max = getStudentWithMaxGrade();
		System.out.println("Class average is " + determineClassAverage()
		+ ". Lowest grade is " + gradeBook.get(min) + " (" + min + ")"
		+ ". Highest grade is " + gradeBook.get(max) + " (" + max + ")");
	}
	
	public void outputBarChart() {
		System.out.println("Grade distibution:");
		
		int[] distribution = new int[11];
		for(Integer value : this.gradeBook.values()) {
			distribution[value / 10]++;
		}
		
		for(int i = 0; i < 11; i++) {
			if(i == 10) {
				System.out.print("100: ");
			} else {
				System.out.print(i * 10 + "-" + (i * 10 + 9) + ": ");
			}
			
			for(int j = 0; j < distribution[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void displayMessage() {
		System.out.println("Welcome to the grade book for " + this.course);
	}
	
	public void addStudent(Student s) { 
		studentList.add(s);
	}
	
	public void setGrade(Student s, int grade) {
		if(grade >= 0 && grade <= 100) {
			this.gradeBook.put(s, grade);			
		} else {
			System.err.println("Error on grade notation");
		}
	}
	
	
	public Course getCourse() {
		return this.course;
	}
	
	
	public String toString() {
		return "GradeBook for Course: " + this.course + "\n" + "With students: \n" + this.studentList.toString(); 
	}
}
