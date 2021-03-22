package sikidom;

import java.util.Random;
import java.util.Scanner;

public class TeglalapApp {
	
	private static Random r = new Random();
	private static Scanner s = new Scanner(System.in);
	
	
	private static void feltolt(Teglalap[] t) {
		for (int i = 0; i < t.length; i++) {
			t[i] = new Teglalap((r.nextInt(10 - 2) + 1 - 2), (r.nextInt(10 - 2) + 1 - 2));
			
		}
	}
	
	private static void legkissebbTeglalapAdatai(Teglalap[] t) {
		int min = 0;
		for (int i = 0; i < t.length; i++) {
			if (t[i].getArea() < t[min].getArea()) {
				min = i;
			}
			
		}
		System.out.println(t[min]);
	}
	
	private static int getInt() {
		int a;
		System.out.println("Szam: ");
		while (!s.hasNextInt()) {
			System.out.println("Nem szam");
			s.next();
		}
		a = s.nextInt();
		s.nextLine();
		return a;
	}
	
	private static Teglalap teglalapBeker() {
		System.out.println("adj meg egy teglalapot");
		int a = getInt();
		int b = getInt();
		return new Teglalap(a, b);
	}
	
	private static int nagyobbTeglalapokSzama(Teglalap[] teglalapok, Teglalap t) {
		int sum = 0;
		for (Teglalap teglalap : teglalapok) {
			if (teglalap.getArea() > t.getArea()) {
				sum++;
			}
		}
		return sum; 
	}
	
	private static void elsoEgyenlo(Teglalap[] teglalapok, Teglalap t) {
		for (Teglalap teglalap : teglalapok) {
			if (teglalap.isEqualTo(t)) {
				System.out.println(teglalap);
				break;
			}
		}
		System.out.println("nincs ilyen");
	}
	
	public static void main(String[] args) {
		Teglalap[] t = new Teglalap[10];
		feltolt(t);
		
		
		legkissebbTeglalapAdatai(t);
		Teglalap myTeglalap = teglalapBeker();
		System.out.println(nagyobbTeglalapokSzama(t, myTeglalap));
		elsoEgyenlo(t, myTeglalap);
		
	}

}
