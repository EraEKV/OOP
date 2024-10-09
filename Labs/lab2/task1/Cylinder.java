package task1;

public class Cylinder extends Shape3D {
	private double radius, height;
	
	public Cylinder() {
		
	}
	
	public Cylinder(double r, double h) {
		this.radius = r;
		this.height = h;
	}
	
	@Override
	public double volume() {
		return Math.PI * radius * radius * height;
	}
	
	@Override
	public double surfaceArea() {
		return 2 * Math.PI * radius * (radius + height);
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) { 
		this.height = height;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) { 
		this.radius = radius;
	}
	
	public String toString() {
		return super.toString() + "Cylinder with radius: " + this.radius + " and with height: " + this.height;
	}
}