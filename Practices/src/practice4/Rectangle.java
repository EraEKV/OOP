package practice4;

public class Rectangle extends Shape {


	public Rectangle() {
		
	}
	
	public Rectangle(int position, Color color) {
		super(position, color);	
	}

	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		if(color == Color.BLACK) {
			System.out.println("▮");
		} else {
			System.err.println("▮");
		}
	}
}
