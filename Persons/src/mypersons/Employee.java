package mypersons;

public class Employee extends Adult {
	private int salary;
	private static int retirementAge = 65;
	
	public Employee(String name, int age, String workplace, int salary) {
		super(name, age, workplace);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + ", age=" + age 
				+ ", getWorkplace()=" + getWorkplace() + "]";
	}
	
	
	
}
