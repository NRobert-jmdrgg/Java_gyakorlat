package munkahely;


import java.util.Scanner;

public class AlkalmazottApp {

	private static Scanner s = new Scanner(System.in);
	
	private static Alkalmazott beolvas() {
		String name;
		int    salary;
		
		System.out.println("Neve: ");
		name = s.nextLine();
		System.out.println("Fizetese: ");
		salary = s.nextInt();
		s.nextLine();
		
		return new Alkalmazott(name, salary);
	}
	
	public static void main(String[] args) {
		Alkalmazott[] dolgozok = new Alkalmazott[5];
		
		for (int i = 0; i < dolgozok.length; i++) {
			dolgozok[i] = beolvas();
		}
		s.close();
		
		largestSalary(dolgozok);
		System.out.println(numberOfSalariesInInterval(dolgozok, 40000, 500000));
		System.out.println(avgSalary(dolgozok));
		System.out.println(sumOfTaxes(dolgozok));
	}
	
	private static Alkalmazott largestSalary(Alkalmazott[] dolgozok) {
		int max = 0;
		for (int i = 1; i < dolgozok.length; i++) {
			if (dolgozok[max].getSalary() < dolgozok[i].getSalary()) {
				max = 1;
			}
		}
		return dolgozok[max];
	}
	
	private static int numberOfSalariesInInterval(Alkalmazott[] dolgozok, int l, int u) {
		int sum = 0;
		for (Alkalmazott alkalmazott : dolgozok) {
			if (alkalmazott.isSalaryBetween(l, u)) {
				sum++;
			}
		}
		return sum;
	}
	
	private static double avgSalary(Alkalmazott[] dolgozok) {
		double sum = 0;
		for (Alkalmazott alkalmazott : dolgozok) {
			sum += alkalmazott.getSalary();
		}
		return sum / dolgozok.length;
	}
 	
	private static double sumOfTaxes(Alkalmazott[] dolgozok) {
		double sum = 0;
		for (Alkalmazott alkalmazott : dolgozok) {
			sum += alkalmazott.getTaxes();
		}
		return sum;
	}
	
}
