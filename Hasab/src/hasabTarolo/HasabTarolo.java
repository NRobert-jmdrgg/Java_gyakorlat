package hasabTarolo;

import testek.*;

public class HasabTarolo {
	private Hasab[] hasabTomb;
	private int maxElem;
	
	HasabTarolo(int maxElem) {
		this.maxElem = maxElem;
		this.hasabTomb = new Hasab[maxElem];
	}
	
	public void setHasab(int i, Hasab h) {
		this.hasabTomb[i] = h;
	}
	
	public int getHasabTombMeret() {
		return this.hasabTomb.length;
	}
	
	public Hasab getHasab(int i) {
		return this.hasabTomb[i];
	}
	
	public int getHasabSzam() {
		int c = 0;
		for (Hasab hasab : hasabTomb) {
			if (hasab != null) {
				c++;
			}
		}
		return c;
	}
	
	public double atlagosTerfogat() {
		double a = 0;
		for (Hasab hasab : hasabTomb) {
			try {
				a += hasab.getTerfogat();
			} catch(NullPointerException e) {
				a += 0;
			}
			
		}
		return a /= hasabTomb.length;
	}
	
	public int hengerekSzama() {
		int c = 0;
		for (Hasab hasab : hasabTomb) {
			if (hasab instanceof Henger) {
				c++;
			}
		}
		return c;
	}
}
