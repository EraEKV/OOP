package task1;

public class Book extends LibraryItem {
	private int numberOfPages;
	
	public Book() {
		
	}
	
	public Book(String title, String author, int year, int pages) {
		super(title, author, year);
		this.numberOfPages = pages;
	}
	
	public void setPages(int pages) {
		this.numberOfPages = pages;
	}
	
	public int getPages() {
		return this.numberOfPages;
	}
	
	public String toString() {
		return super.toString() + " and with number of pages " + this.numberOfPages;
	}
}
