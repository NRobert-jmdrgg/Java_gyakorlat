package munkahely;

public class Alkalmazott {
	private String name;
	private int    salary;
	
	public void increaseSalary(int bonus) {
		this.salary += bonus;
	}

	@Override
	public String toString() {
		return "Alkalmazott [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
