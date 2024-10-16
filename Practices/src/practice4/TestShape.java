package practice4;

import java.util.Vector;

public class TestShape {
	
	public static void main(String[] args) {
		Vector<Shape> shapes = new Vector<>();
		
		Circle c1 = new Circle(3, Color.RED);
		Circle c2 = new Circle(14, Color.BLACK);
		Circle c3 = new Circle(7, Color.RED);
		
		
		Triangle t1 = new Triangle(1, Color.BLACK);
		Triangle t2 = new Triangle(15, Color.RED);
		Triangle t3 = new Triangle(8, Color.BLACK);
		
		shapes.add(c1);
		shapes.add(c2);
		shapes.add(c3);
		shapes.add(t1);
		shapes.add(t2);
		shapes.add(t3);
		
		for(Shape s : shapes) {
			s.draw();
		}
		
		
	}
}
