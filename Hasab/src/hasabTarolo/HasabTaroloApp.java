package hasabTarolo;

import testek.*;
import java.util.Scanner;

public class HasabTaroloApp {

	private static Scanner scan = new Scanner(System.in);
	
	private static Teglatest readTeglatest() {
		int a;
		int b;
		int m;
		System.out.println("A oldal : ");
		a = scan.nextInt();
		scan.nextLine();
		System.out.println("B oldal : ");
		b = scan.nextInt();
		scan.nextLine();
		System.out.println("Magassag : ");
		m = scan.nextInt();
		scan.nextLine();
		
		return new Teglatest(m, a, b);
	}
	
	public static Henger readHenger() {
		int s;
		int m;
		
		System.out.println("sugar : ");
		s = scan.nextInt();
		scan.nextLine();
		System.out.println("Magassag : ");
		m = scan.nextInt();
		scan.nextLine();
		
		return new Henger(m, s);
	}
	
	public static void main(String[] args) {
		HasabTarolo ht = new HasabTarolo(5);
		
		ht.setHasab(0, readTeglatest());
		ht.setHasab(1, null);
		ht.setHasab(2, readHenger());
		ht.setHasab(3, null);
		ht.setHasab(4, readHenger());
		
		for (int i = 0; i < ht.getHasabTombMeret(); i++) {
			System.out.println(ht.getHasab(i));
		}
		
		System.out.println(ht.atlagosTerfogat());
	}

}
