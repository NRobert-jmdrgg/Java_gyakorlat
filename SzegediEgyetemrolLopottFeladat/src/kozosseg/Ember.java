package kozosseg;

/* http://www.inf.u-szeged.hu/~gmark/files/prog1/prog1_varos.pdf*/

class Ember {
	private String name;
	private int eletkor;
	private int fizetes;
	private int penz;
	private boolean no;
	
	public Ember() {
		this("", 0, 0, 0, true);
	}
	
	public Ember(String name, boolean no) {
		this(name, 0, 0, 0, no);
	}
	
	public Ember(String name, int eletkor, int fizetes, int penz, boolean no) {
		super();
		this.name = name;
		if (eletkor >= 0) this.eletkor = eletkor; 
		if (fizetes >= 0) this.fizetes = fizetes;
		if (penz >= 0) this.penz = penz;
		this.no = no;
	}

	public String getName() { return name; }

	public int getEletkor() { return eletkor; }

	public int getFizetes() { return fizetes; }

	public int getPenz() { return penz;	}

	public boolean isNo() { return no; }
}
