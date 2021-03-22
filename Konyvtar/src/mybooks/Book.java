package mybooks;

import java.time.LocalDate;

public class Book {
	private String title;
	private String author;
	private int    yearOfPublication;
	private int    price;
	
	private static LocalDate currentDate = LocalDate.now();
	private static int year = currentDate.getYear();
	
	public Book(String title, String author) {
		this(title, author, year, 2500);
	}

	public Book(String title, String author, int yearOfPublication, int price) {
		super();
		this.title = title;
		this.author = author;
		this.yearOfPublication = yearOfPublication;
		this.price = price;
	}
	
	public void increaseByPercent(int percent) {
		this.price = this.price * ((100 + percent) / 100); 
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", yearOfPublication=" + yearOfPublication + ", price="
				+ price + "]";
	}
	
	
	
	
	
}
