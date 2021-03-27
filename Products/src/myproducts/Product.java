package myproducts;

public class Product {
	protected String name;
	protected int nettoAr;
	protected int afaKulcs;
	
	public Product(String name, int nettoAr, int afaKulcs) {
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
	
	public void nettoNovelSzazalekkal(int sz) {
		this.nettoAr += (this.nettoAr * (sz / 100));
	}
	
	public int arOsszehasonlit(Product a) {
		if (this.getBruttoAr() > a.getBruttoAr()) {
			return 1;
		} else if (this.getBruttoAr() < a.getBruttoAr()) {
			return -1;
		} else {
			return 0;
		}
	}
	
}
