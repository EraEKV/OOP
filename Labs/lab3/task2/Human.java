package task2;

public class Human implements Runnable, Swimable {

	@Override
	public void swim() {
		System.out.println("Human can swim and swimming");
	}

	@Override
	public void run() {
		System.out.println("Human run");
	}

	@Override
	public void move() {
		System.out.println("Human can move");		
	}

}
