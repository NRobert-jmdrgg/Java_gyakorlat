package testek;

abstract class Hasab {
	private int magassag;

	public Hasab(int magassag) {
		super();
		this.magassag = magassag;
	}

	public int getMagassag() {
		return magassag;
	}
	
	abstract double alapterulet();
	
}
