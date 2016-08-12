package shapeClasses;

public class Triangle extends Shape {

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (.5 * base * height);
	}

	public Triangle(double base, double height, String Name) {
		super();
		setBase(base);
		setHeight(height);
		setName(Name);
	}

	private double base;
	private double height;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
