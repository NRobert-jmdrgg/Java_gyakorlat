package testek;

public class Henger extends Hasab {
	private double sugar;

	public Henger(int magassag, double sugar) {
		super(magassag);
		this.sugar = sugar;
	}
	
	public double getAlapterulet() {
		return this.sugar * this.sugar * Math.PI;
	}

	@Override
	public String toString() {
		return "Henger [sugar=" + sugar + ", magassag=" + magassag + ", getTerfogat()=" + this.getTerfogat() + "]";
	}

	
	
}
