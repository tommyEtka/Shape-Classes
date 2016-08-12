package shapeClasses;

public abstract class Shape {

	private String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public abstract double getArea();

}
