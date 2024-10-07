package task5;

public class Dog extends Animal {
	
	public Dog() {
		
	}
	
	public Dog(String name, int age) {
		super(name, age);
		super.setCare(3);
	}
	
	public String getSound() {
		return "Gav";
	}
	
	public String toString() {
		return super.toString() + 
				", Dog";
	}
}
