package practice4;

public abstract class Shape {
	Color color;
	int position;
	
	public Shape() {
		
	}
	
	public Shape(int position, Color color) {
		this.position = position;
		this.color = color;
	}
	
	public void draw() {
		System.out.print(" ".repeat(position));
	}
	
	public String toString() {
		return this.position + "" + this.color;
	}
}
