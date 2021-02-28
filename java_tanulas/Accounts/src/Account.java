
public class Account {
	private String name;
	private double balance;
	
	public Account(String s, double b) {
		this.name = s;
		this.balance = b;
	}
	
	public void withdrawal(int n) {
		this.balance -= n;
	}
	
	public void deposit(int n) {
		this.balance += n;
	}
	
	public double balance() {
		return this.balance;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + "]";
	}
	
	
}
