package shapeClasses;

public class Rectangle extends Shape {

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

	public Rectangle(double len, double wid, String Name) {
		setLength(len);
		setWidth(wid);
		setName(Name);

	}

	private double length;
	private double width;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
