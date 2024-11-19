package task2;

public class Bird implements Flyable {

	@Override
	public void move() {
		System.out.println("");
	}

	@Override
	public void fly() {
		System.out.println("Bird can fly");
	}

//	some birds can swim and run also
}
