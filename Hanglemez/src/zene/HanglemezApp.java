package zene;

import java.util.Scanner;

public class HanglemezApp {

	private static Scanner s = new Scanner(System.in);
	
	private static int beolvas() {
		int a;
		while(!s.hasNextInt()) {
			System.out.println("Nem szam");
			s.next();
		}
		a = s.nextInt();
		s.nextLine();
		return a;
	}
	
	private static void longestRecord(Hanglemez[] h) {
		int max = 0;
		for (int i = 1; i < h.length; i++) {
			if (h[max].getLength() < h[i].getLength()) {
				max = i;
			}
			
		}
		System.out.println(h[max]);
	}
	
	private static Hanglemez hanglemezBeolvas() {
		String author;
		String title;
		int    length;
		
		System.out.println("Eloado: ");
		author = s.nextLine();
		System.out.println("Cim: ");
		title = s.nextLine();
		System.out.println("Hossz: ");
		length = s.nextInt();
		s.nextLine();
		
		return new Hanglemez(author, title, length);
	}
	
	private static void hanglemezekBeolvas(Hanglemez[] h) {
		for (int i = 0; i < h.length; i++) {
			h[0] = hanglemezBeolvas();
		}
	}
	
	private static void beolvasottRekordjai(Hanglemez[] h) {
		String name;
		name = s.nextLine();
		
		for (Hanglemez hanglemez : h) {
			if (hanglemez.isAuthor(name) {
				System.out.println(hanglemez);
			}
		}
	}
	
	public static void main(String[] args) {
		int 		meret = beolvas();
		Hanglemez[] h = new Hanglemez[meret];
		hanglemezekBeolvas(h);
		longestRecord(h);
		
	}

}
