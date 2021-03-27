package hatodikhet;

import java.util.Scanner;

public class AlkalmazottApp {
	
	private static Scanner s = new Scanner(System.in);
	
	private static int beolvas() {
		int a;
		while (!s.hasNextInt()) {
			System.out.println("Nem szam");
			s.next();
		}
		a = s.nextInt();
		s.nextLine();
		return a;
	}
	
	private static Alkalmazott alkalmazottBeolvas() {
		String name;
		int age;
		
		System.out.println("Nev: ");
		name = s.nextLine();
		System.out.println("Age: ");
		age = s.nextInt();
		s.nextLine();
		
		return new Alkalmazott(name, age);
	}
	
	private static void alkalmazottKiir(Alkalmazott[] a) {
		for (Alkalmazott alkalmazott : a) {
			System.out.println(alkalmazott);
		}
	}
	
	private static void otEvNyugdijigKiir(Alkalmazott[] a) {
		for (Alkalmazott alkalmazott : a) {
			if (alkalmazott.yearsUntilRetirement() < 5) {
				System.out.println(alkalmazott);
			}
		}
	}
	
	public static void main(String[] args) {
		int n = beolvas();
		Alkalmazott[] a = new Alkalmazott[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = alkalmazottBeolvas();
		}
		
		alkalmazottKiir(a);
		Alkalmazott.setRetirementAge(50);
		alkalmazottKiir(a);
		
		otEvNyugdijigKiir(a);
		
		//TODO fejezd be xd
		
	}
}
