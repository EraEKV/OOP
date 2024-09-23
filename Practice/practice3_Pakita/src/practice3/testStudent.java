package practice3;

public class testStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(); // 1st constructor
		//you can also pass data using a scanner
		s.age = 17;
		s.name = "Pakita";
		s.setId(6607); // s.id is not available, since id is private
		s.major = Faculty.FIT; // enumeration. Read more about enums in a book, page 60
		
		Student s2 = new Student(8807); // 2nd constructor
		Student s3 = new Student(9907, "Pakita"); // 3rd constructor
		System.out.println(s2+ "  , "+s3); // students, why are some fields here are equal to null/zero ?
		//how to fix it? 
		Student s4 = new Student(9903, "Ann", Faculty.FOGI); // 4th constructor
		Student s5 = new Student(9902, "Ann", Faculty.FEF); // 5th constructor

		System.out.println(s);
		System.out.println(s5.toString());
		System.out.println(s4.getId());
		System.out.println(Student.numOfStuds);
		
	}

}
