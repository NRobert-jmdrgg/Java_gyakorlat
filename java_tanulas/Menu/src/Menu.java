
import java.util.*;

public class Menu {
	private ArrayList<String> meals;
	
	public Menu() {
		this.meals = new ArrayList<String>();
	}
	
	public void addMeal(String s) {
		this.meals.add(s);
	}
	
	public void printMenu() {
		System.out.print(this.meals);
	}
	
	public void clearMenu() {
		this.meals.clear();
	}
}
