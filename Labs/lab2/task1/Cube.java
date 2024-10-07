package task1;

public class Cube extends Shape3D {
	private double side;
	
	public Cube() {
		
	}
	
	public Cube(double a) {
		this.side = a;
	}
	
	@Override
	public double volume() {
		return side * side * side;
	}
	
	@Override
	public double surfaceArea() {
		return 6 * side * side;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) { 
		this.side = side;
	}
	
	public String toString() {
		return "Cube with side: " + this.side;
	}
}