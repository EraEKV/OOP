package practice3;

public class Dog extends Animal {
	
	public Dog() {
		
	}
	
	public Dog(String name) {
		super(name);
	}
	
	public Dog(int age) {
		super(age);
	}
	
	public Dog(String name, int age) {
		super(name, age);
	}
	
	public String voice() {
		return "Gav";
	}
	
	public String voice(int times) {
		String voices = "";
		for(int i = 0; i < times; i++) {
			voices = voices + "Gav! ";
		}
		return voices;
	}
	
	public String toString() {
		return "This is a dog with name " + getName() + " with age " + getAge();
	}
}
