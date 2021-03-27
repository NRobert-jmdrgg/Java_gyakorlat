package myproducts;

public class Bread extends Product {
	private double mennyiseg;

	public Bread(String name, int nettoAr, int afaKulcs, double mennyiseg) {
		//meghivjuk a product konstruktorat
		super(name, nettoAr, afaKulcs);
		this.mennyiseg = mennyiseg;
	}

	@Override
	public String toString() {
		return "Bread [mennyiseg=" + mennyiseg + ", name=" + name + ", nettoAr=" + nettoAr + ", afaKulcs=" + afaKulcs
				+ " egysegar: "+ this.getBruttoAr() / mennyiseg + "]";
	}

	public double getMennyiseg() {
		return mennyiseg;
	}
	
	public static boolean kenyerHasonlit(Bread a, Bread b) {
		if (a.getBruttoAr() / a.mennyiseg > b.getBruttoAr() / b.mennyiseg) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
