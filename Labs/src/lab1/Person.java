package lab1;

public class Person {
	private String name;
	private Gender gender;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(Gender gender) {
		this.gender = gender;
	}
	
	public Person(String name, Gender gender) {
		this(name);
		this.gender = gender;
	}
	
	public Gender getGender() {
		return this.gender;
	}
	
	public String toString() {
		return "Simple human with name " + this.name + " and with gender " + this.gender;
	}
}
