package shapeClasses;

public class Circle extends Shape {

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}
	
	
	public Circle(double radius, String Name){
		setRadius(radius);
		setName(Name);
	}
	

	private double radius;

	public double getRaidus() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;

	}
}
