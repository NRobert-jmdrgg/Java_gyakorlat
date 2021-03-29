package hatodikhet;

public class Alkalmazott {
	private String name;
	private int    age;
	private int    salary;
	
	private static int retirementAge = 65;
	
	@Override
	public String toString() {
		return "Alkalmazott [name=" + name + ", age=" + age + ", salary=" + salary + ", yearsUntilRetirement()="
				+ yearsUntilRetirement() + "]";
	}

	public Alkalmazott(String name, int age) {
		this(name, age, 10000*age);
	}

	public Alkalmazott(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public int yearsUntilRetirement() {
		return retirementAge - this.age;
	}
	
	public int getSalary() {
		return salary;
	}

	public static Alkalmazott isCloserToRetirement(Alkalmazott a, Alkalmazott b) {
		if (a.yearsUntilRetirement() <= b.yearsUntilRetirement()) {
			return b;
		} else if (a.yearsUntilRetirement() > b.yearsUntilRetirement()) {
			return a;
		} else {
			return a;
		}
	}

	public static void setRetirementAge(int r) {
		retirementAge = r;
	}
	
	
	
	
}
