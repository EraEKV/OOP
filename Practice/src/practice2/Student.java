package practice2;

public class Student {
	private String name;
	private int id;
	private int yearOfStudy = 1;

	static int numOfStudents = 0;

	public Student() {
		id = ++numOfStudents;
	}

	public Student(String name) {
		this();
		this.name = name;
	}

	public Student(String name, int year) {
		this(name);
		this.yearOfStudy = year;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}

	public int getYear() {
		return this.yearOfStudy;
	}

	public void incrementYear() {
		this.yearOfStudy++;
	}

	public String toString() {
		return "Student " + this.name + ", id: " + this.id;
	}

}