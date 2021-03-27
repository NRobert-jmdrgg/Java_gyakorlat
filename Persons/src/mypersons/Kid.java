package mypersons;

public class Kid extends Person {
	private String school;

	public Kid(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}

	@Override
	public String toString() {
		return "Kid [school=" + school + ", name=" + name + ", age=" + age + "]";
	}

	public String getSchool() {
		return school;
	}
	
	
	
}
