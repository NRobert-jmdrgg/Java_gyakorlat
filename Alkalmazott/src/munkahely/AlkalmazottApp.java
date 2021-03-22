package munkahely;

public class AlkalmazottApp {

	public static void main(String[] args) {
		Alkalmazott a = new Alkalmazott("Laci", 20000);
		System.out.println(a);
		a.increaseSalary(2000000);
		System.out.println(a);
	}
	
	
}
