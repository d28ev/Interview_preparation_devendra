package test;

public class Circle extends Shape {
	private double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		
		return (22 * radius * radius)/7;
	}

}
