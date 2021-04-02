package testek;

abstract class Hasab {
	protected int magassag;

	public Hasab(int magassag) {
		this.magassag = magassag;
	}

	public int getMagassag() {
		return magassag;
	}
	
	abstract public double getAlapterulet();
	
	public double getTerfogat() {
		return this.getAlapterulet() * this.magassag;
	}
	
	public boolean osszehasonlito(Hasab a) {
		return (this.getAlapterulet() > a.getAlapterulet()); 
	}
}
