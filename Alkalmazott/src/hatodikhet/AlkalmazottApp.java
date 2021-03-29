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
		int ev;
		String ho;
		int nap;
		
		System.out.println("Nev: ");
		name = s.nextLine();
		System.out.println("Sz.Ev: ");
		ev = s.nextInt();
		s.nextLine();
		System.out.println("sz.ho: ");
		ho = s.nextLine();
		System.out.println("sz.nap: ");
		nap = s.nextInt();
		s.nextLine();
		return new Alkalmazott(name, nap, ev, nap);
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
	
	private static void printAtlagnalNagyobbFizetes(Alkalmazott[] a) {
		double atlag = 0;
		for (Alkalmazott alkalmazott : a) {
			atlag += alkalmazott.getSalary();
		}
		atlag /= a.length;
		
		for (Alkalmazott alkalmazott : a) {
			if (alkalmazott.getSalary() > atlag) {
				System.out.println(alkalmazott);
			}
		}
		
	}
	
	private static void rendezNyugdijSzerint(Alkalmazott[] a) {
		int minindex;
		for (int i = 0; i < a.length; i++) {
			minindex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].yearsUntilRetirement() < a[minindex].yearsUntilRetirement()) {
					minindex = j;
				}
			}
			if (minindex != i) {
				Alkalmazott temp = a[i];
				a[i] = a[minindex];
				a[minindex] = temp;
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
		
		alkalmazottKiir(a);
		
		otEvNyugdijigKiir(a);
		
		
		
	}
}
