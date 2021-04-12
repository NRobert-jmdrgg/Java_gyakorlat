package kozosseg;

/* http://www.inf.u-szeged.hu/~gmark/files/prog1/prog1_varos.pdf*/

class Ember {
	private String nev;
	private int eletkor;
	private int fizetes;
	private int penz;
	private boolean no;
	
	public Ember() {
		this("", 0, 0, 0, true);
	}
	
	public Ember(String nev, boolean no) {
		this(nev, 0, 0, 0, no);
	}
	
	public Ember(String nev, int eletkor, int fizetes, int penz, boolean no) {
		super();
		this.nev = nev;
		if (eletkor >= 0) this.eletkor = eletkor; 
		if (fizetes >= 0) this.fizetes = fizetes;
		if (penz >= 0) this.penz = penz;
		this.no = no;
	}

	public String getNev() { return nev; }
	public int getEletkor() { return eletkor; }
	public int getFizetes() { return fizetes; }
	public int getPenz() { return penz;	}
	public boolean isNo() { return no; }
	
	public void allastSzerez(int fizetes) {
		this.fizetes = fizetes;
	}
	
	public void allastElveszit() {
		fizetes = 0;
	}
	
	public void fizetestKap() {
		penz += fizetes;
	}
	
	public boolean koltekezik(int elkoltottPenz) {
		if (penz > elkoltottPenz) {
			System.out.println(nev + " elkoltott " + elkoltottPenz + " ft-ot");
			penz -= elkoltottPenz;
			return true;
		} else {
			System.out.println(nev + " tul szegeny");
			return false;
		}
	}
	
	public void idosodik() {
		eletkor++;
	}
	
	public boolean munkanelkuli() {
		return (fizetes == 0);
	}

	@Override
	public String toString() {
		return "Ember [nev=" + nev + ", eletkor=" + eletkor + ", fizetes=" + fizetes + ", penz=" + penz + ", no=" + no
				+ ", munkanelkuli()=" + munkanelkuli() + "]";
	}
	
	
}
