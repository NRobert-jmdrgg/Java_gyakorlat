package kozosseg;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Lakohaz l = new Lakohaz(50, "feher", 3000, 1, 4, 505400);
		
		for (int i = 0; i < l.getLakokSzama(); i++) {
			Ember e = new Ember("EmberNev " + i, true);
			l.bekoltoz(e);
		}
		
		System.out.println(l);
		
	}

}
