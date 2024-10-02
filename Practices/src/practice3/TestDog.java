package practice3;

public class TestDog {

	public static void main(String[] args) {
		Dog myBoy = new Dog("Aktos", 1);
		
		System.out.println(myBoy.voice());
		System.out.println(myBoy.voice(10));
	}

}
