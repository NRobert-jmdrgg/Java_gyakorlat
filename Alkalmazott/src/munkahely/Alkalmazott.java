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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Alkalmazott [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
