package styles;

import mybooks.*;

public class BookStyle extends Book {
	private String style;

	public BookStyle(String title, String author, int yearOfPublication, int price, String style) {
		super(title, author, yearOfPublication, price);
		this.style = style;
	}

	public String getStyle() {
		return style;
	}
	
	
}
