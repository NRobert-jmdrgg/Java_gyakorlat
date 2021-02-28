
public class Main {

	public static void main(String[] args) {
		Menu m = new Menu();
		m.addMeal("Hot dog");
		m.addMeal("Hamburger");
		m.printMenu();
		m.clearMenu();
		
		m.printMenu();
	}

}
