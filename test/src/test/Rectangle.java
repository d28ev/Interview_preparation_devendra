package test;

public class Rectangle extends Shape {
	private double length, width;
	
	Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		
		return length * width;
	}

}
