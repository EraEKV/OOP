package task6;

public class SystemTest {

	public static void main(String[] args) {
		Person john = new Employee("John", 30, "Engineer");
		Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");
		Animal murka = new Cat("Murka", 5);
		Animal rex = new Dog("Rex", 2);
		try { // John owns Rex
			john.assignPet(murka);
			john.assignPet(rex);
		} catch (Exception e) {
			System.out.println(e);
		}
		PersonRegistry registry = new PersonRegistry();
		registry.addPerson(john);
		registry.addPerson(alice);
		System.out.println("\n" + registry.findPeopleWithPets());
		// John goes on vacation and leaves Rex with Alice
		john.leavePetWith(alice);
		// Registry reflects that Alice is taking care of Rex
		System.out.println(registry);
		// John returns from vacation and retrieves Rex
		john.retrievePetFrom(alice);
		// Registry reflects that John has his dog back
		System.out.println(registry);

		System.out.println("\n" + registry.findPeopleWithoutPets());
		System.out.println("\n" + registry.findPeopleWithPets());
	}

}
