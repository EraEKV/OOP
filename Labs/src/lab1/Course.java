package lab1;

public class Course {
	private String code;
	private String discipline;
	
	public Course() {
		
	}
	
	public Course(String code, String discipline) {
		this.code = code;
		this.discipline = discipline;
	}
	
	public String toString() {
		return code + " " + discipline; 
	}
}
