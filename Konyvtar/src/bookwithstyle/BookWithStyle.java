package bookwithstyle;

import java.util.Comparator;

import mybooks.Book;

public class BookWithStyle extends Book {
	public enum BookStyle {CRIME, COOK, OTHER};
	
	private BookStyle bookStyle;

	public BookWithStyle(String title, String author, int yearOfPublication, int price, BookStyle bookStyle) {
		super(title, author, yearOfPublication, price);
		this.bookStyle = bookStyle;
	}

	@Override
	public String toString() {
		return "BookWithStyle [toString()=" + super.toString() + ", bookStyle=" + bookStyle + "]";
	}

	public BookStyle getBookStyle() {
		return bookStyle;
	}
	
	public static class AuthorSorter implements Comparator<BookWithStyle> {

		@Override
		public int compare(BookWithStyle o1, BookWithStyle o2) {
			
			return o1.title.compareTo(o2.title);
		}	
	}
	
	public static class PriceSorter implements Comparator<BookWithStyle> {

		@Override
		public int compare(BookWithStyle o1, BookWithStyle o2) {
			
			return o1.getPrice() - o2.getPrice();
		}
		
	}
	
}
