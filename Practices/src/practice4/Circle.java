package practice4;

public class Circle extends Shape {

	public Circle() {
		
	}
	
	public Circle(int position, Color color) {
		super(position, color);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		if(color == Color.BLACK) {
			System.out.println("⬤");
		} else {
			System.err.println("⬤");
		}
	}
	
}
