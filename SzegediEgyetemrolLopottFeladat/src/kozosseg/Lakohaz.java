package kozosseg;

import java.util.Arrays;
import java.lang.StringBuilder;

class Lakohaz extends Epulet {
	private int lakokSzama;
	private int jelenlegiLakokSzama;
	private int fenntartasiKoltseg;
	private Ember[] lakok;
	private int koltseg;
	
	public Lakohaz(double negyzetmeter, String szin, int epitesEve, double allapot, int lakokSzama, int fenntartasiKoltseg) {
		super(negyzetmeter, szin, epitesEve, allapot);
		if (lakokSzama > 0) this.lakokSzama = lakokSzama;
		if (fenntartasiKoltseg > 0) this.fenntartasiKoltseg = fenntartasiKoltseg;
		jelenlegiLakokSzama = 0;
		lakok = new Ember[lakokSzama];
	}
	
	public int getLakokSzama() { return lakokSzama; }
	public int getJelenlegiLakokSzama() { return jelenlegiLakokSzama; }
	public int getFenntartasiKoltseg() { return fenntartasiKoltseg; }
	public int getKoltseg() { return koltseg; }
	
	public void setKoltseg(int koltseg) { 
		if (koltseg > 0) this.koltseg = koltseg;
		else this.koltseg = Math.abs(koltseg);
	}
	
	public Ember[] getLakok() {
		Ember[] emberek = new Ember[lakok.length];
		System.arraycopy(emberek, 0, lakok, 0, lakok.length);
		return  emberek;
	}

	
	
	@Override
	public String toString() {
		StringBuilder eredmeny = new StringBuilder(super.toString() + " Lakohaz [lakokSzama=" + lakokSzama + ", jelenlegiLakokSzama=" + jelenlegiLakokSzama
				+ ", fenntartasiKoltseg=" + fenntartasiKoltseg + "koltseg="
				+ koltseg + "]" + System.lineSeparator());
		
		for (Ember ember : lakok) {
			eredmeny.append(ember.toString() + System.lineSeparator());
		}
		return eredmeny.toString();
	}

	public void bekoltoz(Ember e) {
		if (jelenlegiLakokSzama < lakokSzama) {
			lakok[jelenlegiLakokSzama] = e;
			jelenlegiLakokSzama++;
		} else {
			System.err.println("Ez teljesen tele lett, jelenleg nem kellenek bele emberek. Hehe.");
		}	
	}
	
	public void kikoltozes(Ember e) {
		for (int i = 0; i < lakok.length; i++) {
			if (lakok[i] == e) {
				for (int j = i; j < lakok.length - 1; j++) {
					lakok[j] = lakok[j + 1];
				}
				lakok[lakok.length - 1] = null;
				return;
			}
		}
		System.err.println("o nem lakik itt");
		return;
	}
	
	public void kilakoltatas() {
		Arrays.fill(lakok, null);
	}
	
	public boolean dijBefizetes() {
		int m = fenntartasiKoltseg;
		for (Ember ember : lakok) {
			if (ember.getPenz() >= m) {
				ember.koltekezik(m);
				return true;
			}
			
			m -= ember.getPenz();
			ember.koltekezik(ember.getPenz());
		}
		kilakoltatas();
		return false;
	}
	
	@Override
	public void osszedol() {
		kilakoltatas();
		super.osszedol();
	}
	
}
