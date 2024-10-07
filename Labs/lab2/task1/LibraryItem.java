package task1;

public abstract class LibraryItem {
	private String author;
	private String title;
	private int publicationYear;
	
	public LibraryItem() {
		
	}
	
	public LibraryItem(String author) {
		this.author = author;
	}
	
	public LibraryItem(String title, String author) {
		this.author = author;
		this.title = title;
	}
	
	public LibraryItem(String title, String author, int publicationYear) {
		this(title, author);
		this.publicationYear = publicationYear;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPublicationYear() {
		return publicationYear;
	}
	
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	
	public String toString() {
		return "Library Item with author " + author + " and title " + title + " that publicated on " + publicationYear;
	}
}
