package point;

import java.awt.Color;

import myproducts.Colorable;

public class ColoredPoint extends Point implements Colorable {
	private Color color;

	public ColoredPoint(Color color) {
		super(0, 0);
		this.color = color;
	}

	@Override
	public String toString() {
		return "SzinesPont [color=" + color + ", x=" + x + ", y=" + y + "]";
	}

	@Override
	public Color getColor() {
		return this.color;
	}

	@Override
	public void setColor(Color color) {
		this.color = color;
	}

	
	
	
	
	
	
}
