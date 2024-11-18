package task6;

public class Cat extends Animal {
		
	public Cat() {

	}
	
	public Cat(String name, int age) {
		super(name, age);
		super.setCare(2);
	}
	
	public String getSound() {
		return "Myau";
	}
	
	public String toString() {
		return super.toString() + 
				", Cat";
	}
	
}
