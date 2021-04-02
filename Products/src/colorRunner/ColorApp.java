package colorRunner;

import java.awt.Color;

import myproducts.Colorable;
import myproducts.Pen;
import point.ColoredPoint;

public class ColorApp {

	public static void setDefaultColor(Colorable c) {
		c.setColor(Colorable.Defaultcolor);
	}
	
	public static void main(String[] args) {
		Colorable c = new ColoredPoint(Color.black);
		System.out.println(c);
		c.setColor(Color.green);
		System.out.println(c);
		
		Colorable t = new Pen("Zebra", Color.blue, 300);
		System.out.println(t);
		t.setColor(Color.red);
		System.out.println(t);
		
		setDefaultColor(c);
		setDefaultColor(t);
		
		System.out.println(c);
		System.err.println(t);
	}
	
	

}
