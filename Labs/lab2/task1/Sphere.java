package task1;

public class Sphere extends Shape3D {
	private double radius;
	
	public Sphere() {
		
	}
	
	public Sphere(double r) {
		this.radius = r;
	}
	
	@Override
	public double volume() {
		return 4 * Math.PI * radius * radius * radius / 3;
	}
	
	@Override
	public double surfaceArea() {
		return 4 * Math.PI * radius * radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) { 
		this.radius = radius;
	}
	
	public String toString() {
		return "Sphere with radius: " + this.radius;
	}
}