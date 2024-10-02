package practice3;

public class Animal {
	private String name;
	private int age;
	
	public Animal() {
		
	}
	
	
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal(int age) {
		this.age = age;
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String voice() {
		return "";
	}
	
	public String toString() {
		return "Animal with name: " + name + " and age: " + age;
	}
}
