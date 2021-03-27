package mypersons;

public class Adult extends Person {
	private String workplace;

	public Adult(String name, int age, String workplace) {
		super(name, age);
		this.workplace = workplace;
	}

	

	@Override
	public String toString() {
		return "Adult [name=" + name + ", age=" + age + "]";
	}



	public String getWorkplace() {
		return workplace;
	}
	
	
	
}
