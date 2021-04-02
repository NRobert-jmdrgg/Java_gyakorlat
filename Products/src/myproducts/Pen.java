package myproducts;

public class Pen extends Product {
	private String color;
	private String brand;
	
	public Pen(String brand, String color, int nettoAr) {
		super("Toll", nettoAr, 27);
		this.color = color;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Pen [color=" + color + ", brand=" + brand + ", nettoAr=" + nettoAr + "]";
	}
	
	
	
	
	
}
