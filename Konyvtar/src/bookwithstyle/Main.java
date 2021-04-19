package bookwithstyle;

import java.util.ArrayList;
import java.util.Arrays;

import bookwithstyle.BookWithStyle.BookStyle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static InputStreamReader is = new InputStreamReader(System.in);
	private static BufferedReader input = new BufferedReader(is);
	
	private static BookWithStyle readBookWithStyle() {
		String title = null;
		String author = null;
		int yearOfPublication = 0;
		int price = 0;
		BookStyle bookStyle = null;
		String style;
		boolean ok = false;
		do {
			try {
				ok = true;
				System.out.println("Cim: ");
				title = input.readLine();
				author = "Robert";
				yearOfPublication = 2000;
				System.out.println("Price : ");
				price = Integer.parseInt(input.readLine());
				style = input.readLine();
				
				bookStyle = BookStyle.valueOf(style.toUpperCase());
			} catch (IllegalArgumentException e) {
				ok = false;
				System.out.println("Nem jo argumentum");
			} catch (IOException e) {
				System.out.println("readline fuckery");
			}
		} while (!ok);
		
		
		return new BookWithStyle(title, author, yearOfPublication, price, bookStyle);
	}
	
	public static void main(String[] args) {
		ArrayList<BookWithStyle> bws = new ArrayList<>();
		
		bws.add(readBookWithStyle());
		bws.add(readBookWithStyle());
		bws.add(readBookWithStyle());
		
		printArrayList(bws);
		
		BookWithStyle[] bs = bws.toArray(new BookWithStyle[bws.size()]);
 		
		Arrays.sort(bs, new BookWithStyle.AuthorSorter());
		
	
	}
	
	private BookWithStyle[] cookCollect(ArrayList<BookWithStyle> a) {
		ArrayList<BookWithStyle> cookBooks = new ArrayList<>();
		for (BookWithStyle bookWithStyle : a) {
			if (bookWithStyle.getBookStyle() == BookStyle.COOK) {
				cookBooks.add(bookWithStyle);
			}
		}
		
		return cookBooks.toArray(new BookWithStyle[cookBooks.size()]);
	}
	
	private static void printArrayList(ArrayList<BookWithStyle> a) {
		for (BookWithStyle bookWithStyle : a) {
			System.out.println(bookWithStyle);
		}
	}

}
