package myproducts;

public class Product {
	private String name;
	private int nettoAr;
	private int afaKulcs;
	
	public Product(String name, int nettoAr, int afaKulcs) {
		super();
		this.name = name;
		this.nettoAr = nettoAr;
		this.afaKulcs = afaKulcs;
	}
	
	public double getBruttoAr() {
		return this.nettoAr * (1 + this.afaKulcs/ 100);
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", nettoAr=" + nettoAr + ", afaKulcs=" + afaKulcs + ", getBruttoAr()="
				+ getBruttoAr() + "]";
	}
	
	
	
}
