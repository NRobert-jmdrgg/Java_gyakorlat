package homework;

public class Homework {
	
	public static void main(String[] args)  {
		Book a = new Book("Neve", "Konyv_cime");
		Book b = new Book("Pista", "nev", 2001, 9000);

		System.out.println(a.toString());
		System.out.println(b.toString());

		System.out.println(Book.comparePublicationDate(a, b));
	}
}
