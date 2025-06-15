package entities;

import entities.enums.Colors;

public abstract class Shape {
	private Colors color;

	public Shape() {
		
	}
	
	public Shape(Colors color) {
		super();
		this.color = color;
	}

	public Colors getColor() {
		return color;
	}

	public void setColor(Colors color) {
		this.color = color;
	}
	
	
	public abstract Double area();


	public void setColor2(Colors color) {
		this.color = color;
	}
}