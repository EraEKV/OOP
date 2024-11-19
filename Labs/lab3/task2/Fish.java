package task2;

public class Fish implements Swimable {

	@Override
	public void move() {
		System.out.println("Fishs can move");
	}

	@Override
	public void swim() {
		System.out.println("Fish always swim");
	}

}
