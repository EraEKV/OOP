package task1;

public class LibrarySystemTest {

	public static void main(String[] args) {
		Book b1 = new Book("Lord of the rings", "Tolkin", 1920, 1078);
		Book b2 = new Book("Автостопомо по галактике", "Adam Duglas", 1994, 640);
		b1.setPages(1020);
		System.out.println(b1.getAuthor() + b1.getPages());
	}
}
