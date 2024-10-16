package practice4;

public class Triangle extends Shape {

	public Triangle(int position, Color color) {
		super(position, color);
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		if(color == Color.BLACK) {
			System.out.println("▲");
		} else {
			System.err.println("▲");
		}
	}

}
