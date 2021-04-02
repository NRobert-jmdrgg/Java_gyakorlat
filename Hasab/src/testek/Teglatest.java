package testek;

public class Teglatest extends Hasab {
	private double sideA;
	private double sideB;
	
	public Teglatest(int magassag, double sideA, double sideB) {
		super(magassag);
		this.sideA = sideA;
		this.sideB = sideB;
	}

	@Override
	public double getAlapterulet() {
		return sideA * sideB;
	}

	@Override
	public String toString() {
		return "Teglatest [sideA=" + sideA + ", sideB=" + sideB + ", magassag=" + magassag + ", getTerfogat()="
				+ getTerfogat() + "]";
	}
	
	
}
