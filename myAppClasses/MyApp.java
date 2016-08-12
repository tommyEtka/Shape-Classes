package myAppClasses;

//import shapeClasses.Shape;
import shapeClasses.*; //you want all of them so you would do *


public class MyApp {

	public static void main(String[] args) {
		
		Shape [] shapeArray = new Shape[5];
		//creating a bunch of references from shape
		//can't do this, create and object Shape s = new Shape(); 
		shapeArray[0] = new Rectangle(12, 10, "R1");
		shapeArray[1] = new Rectangle( 4, 5, "R2");
		shapeArray[2] = new Circle(3, "C1");
		shapeArray[3] = new Triangle(10, 6, "T1");
		shapeArray[4] = new Triangle(3, 7, "T2");
		
		double totalArea = 0;
		for (int i = 0; i < shapeArray.length; i++) {
			totalArea += shapeArray[i].getArea();
			
		} System.out.println(totalArea);
		

	}

}
