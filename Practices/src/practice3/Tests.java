package practice3;

import java.util.Vector;

public class Tests {

	public static void main(String[] args) {
		Vector <Person> people = new Vector<>();
		for(int i = 0; i < 5; i++) {
			String name = "";
			String address;
			name += (char)('A' + i);
			address = "Kairat mkr";
			Student student = new Student(name, address, "SITE", 1, 2500.0);
			people.add(student);
		}

		System.out.println(people.toString());
		
		for(int i = 1; i < 3; i++) {
			String name = "";
			String address;
			name += (char)('E' + i);
			address = "Kairat mkr";
			Staff staff = new Staff(name, address, "SITE", 50000);
			people.add(staff);
		}
		

		System.out.println(people.toString());
	}

}
