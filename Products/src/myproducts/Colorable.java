package myproducts;

import java.awt.Color;

public interface Colorable {
	Color Defaultcolor = Color.red;
	
	Color getColor();
	void setColor(Color color);
}
