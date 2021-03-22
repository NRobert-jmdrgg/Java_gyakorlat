package sikidom;

public class TeglalapApp {
	
	public static void main(String[] args) {
		Teglalap a = new Teglalap(5);
		Teglalap b = new Teglalap(2, 4);
		
		Teglalap c = a;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		a.setSideA(5);
		a.setSideB(7);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		a = b;
		System.out.println((a == b));
		System.out.println((a == c));
		System.out.println(a.isEqualTo(b));
		
	}

}
