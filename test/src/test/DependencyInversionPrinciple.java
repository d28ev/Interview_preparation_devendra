package test;

public class DependencyInversionPrinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindArea fa = new FindArea();
		Shape sp = new Rectangle(10,11);
		System.out.println(fa.getArea(sp));
		
		sp = new Circle(5);
		System.out.println(sp.calculateArea());

	}

}
