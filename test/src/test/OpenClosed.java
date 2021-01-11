package test;

public class OpenClosed {
	public static void main(String[] args) {
	System.out.println("Hey i am open closed priniciple");
	
	Rectangle rec = new Rectangle(10, 20);
	System.out.println("Area is : " + rec.calculateArea());
	
	Circle r = new Circle(10);
	System.out.println("Circle area is : "+ r.calculateArea());
	}
}
