package kozosseg;

import java.time.LocalDate;

class Epulet {
	protected double negyzetmeter;
	protected String szin;
	protected final int epitesEve;
	protected double allapot;

	public Epulet() {
		this(50, "feher", LocalDate.now().getYear(), 1);
	}
	
	public Epulet(double negyzetmeter, String szin, int epitesEve, double allapot) {
		super();
		this.negyzetmeter = negyzetmeter;
		this.szin = szin;
		this.epitesEve = epitesEve;
		if (allapot >= 0 && allapot <= 1) this.allapot = allapot;
	}

	public double getNegyzetmeter() { return negyzetmeter; }
	public void setNegyzetmeter(double negyzetmeter) { this.negyzetmeter = negyzetmeter; }
	public String getSzin() { return szin; }
	public int getEpitesEve() { return epitesEve; }
	public double getAllapot() { return allapot; }

	@Override
	public String toString() {
		return "Epulet [negyzetmeter=" + negyzetmeter + ", szin=" + szin + ", epitesEve=" + epitesEve + ", allapot="
				+ allapot + "]";
	}
	
	public void renovalas() {
		allapot = 1;
	}
	
	public void osszedol() {
		allapot = 0;
	}
	
	public void festes(String szin) {
		if (!this.szin.equalsIgnoreCase(szin)) this.szin = szin;
		else renovalas();
	}
	
	public boolean dijatBefizet() {
		return true;
	}

}
