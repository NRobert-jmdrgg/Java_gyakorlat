package styles.alpackage;

import styles.BookStyle;

import java.util.HashSet;
import java.util.Scanner;

public class BookStyleApp {
	
	private static Scanner scan = new Scanner(System.in);
	
	private static int readInt() {
		int a;
		do {
			while (!scan.hasNextInt()) {
				System.out.println("Nem szam!!");
				scan.next();
			}
			a = scan.nextInt();
			scan.nextLine();
		} while (a < 1 || a > 10);
		return a;
	}
	
	private static BookStyle readBookStyle() {
		String author;
		String title;
		int year;
		int price;
		String style;
		
		System.out.println("Szerzo: ");
		author = scan.nextLine();
		System.out.println("cim: ");
		title = scan.nextLine();
		System.out.println("publikacio eve: ");
		year = scan.nextInt();
		scan.nextLine();
		System.out.println("ar: ");
		price = scan.nextInt();
		scan.nextLine();
		System.out.println("Stilus: ");
		style = scan.nextLine();
		
		return new BookStyle(title, author, year, price, style);
	}
	
	private static int kulonfeleKonyvek(BookStyle[] bs) {
		HashSet<String> stilusHalmaz = new HashSet<>();
		//halmazba nem lehet ket egyforma elem
		for (BookStyle b : bs) {
			stilusHalmaz.add(b.getStyle());
		}
		return stilusHalmaz.size();
	}
	
	private static void printScifi(BookStyle[] bs) {
		for (BookStyle bookStyle : bs) {
			if (bookStyle.getStyle().toLowerCase().equals("scifi")) {
				System.out.println(bookStyle);
			}
		}
	}
	
	private static void scifiAtlagar(BookStyle[] bs) {
		double sum = 0;
		for (BookStyle bookStyle : bs) {
			if (bookStyle.getStyle().toLowerCase().equals("scifi")) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		int n = readInt();
		
		BookStyle[] bs = new BookStyle[n];
		
		for (int i = 0; i < n; i++) {
			bs[i] = readBookStyle();
		}
		
		System.out.println(kulonfeleKonyvek(bs));
	}

}
