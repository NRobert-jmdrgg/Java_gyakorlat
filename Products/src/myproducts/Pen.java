package myproducts;

import java.awt.Color;

public class Pen extends Product implements Colorable {
	private Color color;
	private String brand;
	
	public Pen(String brand, Color color, int nettoAr) {
		super("Toll", nettoAr, 27);
		this.color = color;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Pen [color=" + color + ", brand=" + brand + ", nettoAr=" + nettoAr + "]";
	}

	@Override
	public Color getColor() {
		return this.color;
	}

	@Override
	public void setColor(Color color) {
		this.color = color;
		
	}
	
	
	
	
	
}
