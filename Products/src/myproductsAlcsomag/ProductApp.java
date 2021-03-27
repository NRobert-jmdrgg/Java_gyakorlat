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
	}

}
