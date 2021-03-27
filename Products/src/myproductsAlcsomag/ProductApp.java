package myproductsAlcsomag;

import myproducts.*;

public class ProductApp {

	public static void main(String[] args) {
		Bread a = new Bread("feher", 300, 27, 0.75);
		Product p = new Product("Locsolo", 600, 27);
		
		System.out.println(a);
		System.out.println(p);
		System.out.println(p.arOsszehasonlit(a));
		System.out.println(a.arOsszehasonlit(p));
		
		Product p2 = a;
		
		System.out.println(p2);
		
		Bread b2 = new Bread("barna", 400, 11, 0.12);
		
		System.out.println(Bread.kenyerHasonlit((Bread)p2, b2));
	}

}
