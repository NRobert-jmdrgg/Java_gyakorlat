package munkahely;

public class Alkalmazott {
	private String 			 name;
	private int    			 salary;
	private static final int ADOKULCS = 16;
	
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
	
	public boolean isSalaryBetween(int l, int u) {
		return ((this.salary >= l) && (this.salary <= u));
	}
	
	public double getTaxes() {
		return this.salary * (ADOKULCS / 100);
	}
	
	public boolean hasBiggerSalaryThan(Alkalmazott a) {
		return (this.salary > a.salary);
	}
	
	
	
	
	
}
