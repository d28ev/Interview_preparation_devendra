package test;

public class FindArea {
//	public double getRectangleArea(Rectangle rec) {
//		return rec.calculateArea();
//	}
	
	//Instead of above Rectangle class dependency,
	//You need to modify suc that it should not depend on any concrete class
	//It should depend on abstract one (ex. - abstract class or interface)
	
	public double getArea(Shape sp) {
		return sp.calculateArea();
	}
	
}
