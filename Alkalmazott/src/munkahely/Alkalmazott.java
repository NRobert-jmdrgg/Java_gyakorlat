package munkahely;

public class Alkalmazott {
	private String name;
	private int    salary;
	
	public void increaseSalary(int bonus) {
		this.salary += bonus;
	}

	public Alkalmazott(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Alkalmazott [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
