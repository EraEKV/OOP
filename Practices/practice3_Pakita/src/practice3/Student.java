package practice3;

class Student {
	private int id;
	String name;
	int age;
	Faculty major;
	static int numOfStuds;
	public Student() {
		numOfStuds++;
	}
	public Student(int id) {
		this();
		this.id = id;
	}
	public Student(int id, String name) {
		this(id);
		this.name = name;
	}
	public Student(int id, String name, Faculty major) {
		this(id, name);
		this.major = major;
	}
	public Student(int id, String name, Faculty major, int age) {
		this(id, name, major);
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return this.name+ " "+this.age+ " "+this.getId()+ " "+this.major;
	}
}
