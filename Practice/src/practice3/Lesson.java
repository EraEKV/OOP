//package practice3;
//
//public class Lecture {
//	int test;
//	static int test1;
//	
//	{
//		this.test = 1;
//	}
//	
//	static {
//		test1 = 2;
//		System.out.println(test1);
//	}
//	
//	
//	@Override
//	public String toString() {
//		return " TEST" + test;
//	}
//	
//	public static void main(String[] args) {
//		Lecture test;
//		test = new Lecture();
////		Lecture test = new Lecture();
//		
//		System.out.println(test);
//	}
//	
//	
//}



package practice3;

public class Lesson {
	String name;
	int id;
	private Time time;
	Format format;
	Days day;
	static int cnt;
	static Vector <Lesson()> lessons;
	static {
		lessons = new Vector<Lesson()>;
	}
	{
		id = cnt++;
		lessons.add(this);
	}
	public Lesson() {
		
	}
	public Lesson(String name, Days day) {
		
	public String toString() {
		return name + " " + time +  "" + day + " " + format;
	}
	

	public static void main(String[] args) {
		Lecture test;
		test = new Lecture();
//		Lecture test = new Lecture();
		
		System.out.println(test);
	}
	
	

}
