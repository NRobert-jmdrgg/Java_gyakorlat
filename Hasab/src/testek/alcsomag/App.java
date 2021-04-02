package testek.alcsomag;

import testek.Henger;
import testek.Teglatest;

public class App {

	public static void main(String[] args) {
		Henger h = new Henger(5, 10);
		System.out.println(h);
		
		Teglatest t = new Teglatest(5, 10, 10);
		System.out.println(t);
		System.out.println(h.osszehasonlito(t));
	}

}
