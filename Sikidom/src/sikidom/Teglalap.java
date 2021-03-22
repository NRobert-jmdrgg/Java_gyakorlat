package sikidom;

public class Teglalap {
	private int sideA;
	private int sideB;
	
	public Teglalap(int sidea, int sideB) {
		super();
		this.sideA = sidea;
		this.sideB = sideB;
	}
	
	public Teglalap(int bothSides) {
		super();
		this.sideA = bothSides;
		this.sideB = bothSides;
	}
	
	public int getArea() {
		return this.sideA * this.sideB;
	}

	@Override
	public String toString() {
		return "Teglalap [sideA=" + sideA + ", sideB=" + sideB + ", Area=" + getArea() + "]";
	}

	public int getSideA() {
		return sideA;
	}

	public void setSideA(int sideA) {
		this.sideA = sideA;
	}

	public int getSideB() {
		return sideB;
	}

	public void setSideB(int sideB) {
		this.sideB = sideB;
	}
	
	public void setBothSides(int bothSides) {
		this.sideA = bothSides;
		this.sideB = bothSides;
	}
	
	public boolean biggerThan(Teglalap t) {
		return (this.getArea() > t.getArea());
	}
	
	public boolean isEqualTo(Teglalap t) {
		 return (this.sideA == t.sideA && this.sideB == t.sideB);
	 }
}
