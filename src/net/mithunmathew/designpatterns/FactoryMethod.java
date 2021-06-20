package net.mithunmathew.designpatterns;

enum ShapeType {
	CIRCLE, RECTANGLE, TRIANGLE
}

abstract class Shape{

	abstract void printShape();

}

class Circle extends Shape{
	
	void printShape() {
		System.out.println("Circle");
	}
	
}

class Rectangle extends Shape{
	
	void printShape() {
		System.out.println("Rectangle");
	}
	
}

class Triangle extends Shape{
	
	void printShape() {
		System.out.println("Triangle");
	}
	
}

class ShapeFactory{
	
	Shape getShape(ShapeType shape) {
		if(shape == ShapeType.CIRCLE) {
			return new Circle();
		}
		else if(shape == ShapeType.RECTANGLE) {
			return new Rectangle();
		}
		if(shape == ShapeType.TRIANGLE) {
			return new Triangle();
		}
		return null;
	}
	
}

public class FactoryMethod {
	public static void main(String args[]) {
		
		ShapeFactory factory = new ShapeFactory();
		
		Shape shape = factory.getShape(ShapeType.RECTANGLE);
		shape.printShape();
		
		shape = factory.getShape(ShapeType.CIRCLE);
		shape.printShape();
		
		shape = factory.getShape(ShapeType.TRIANGLE);
		shape.printShape();
		
	}
}
