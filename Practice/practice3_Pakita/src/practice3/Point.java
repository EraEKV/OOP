package practice3;

public class Point {
	int x;
	public Point() {
		
	}
	public Point(int x) {
		this.x = x;
	}
	//belongs to the object, use it as p1.getDistance(p2)
	public int getDistance(Point p2) { 
		return getDistance(this,p2);
	}
	//belongs to the class, use it as Point.getDistance(p1,p2)
	public static int getDistance(Point p1, Point p2) {
		return Math.abs(p1.x-p2.x);
	}
	public String toString() {
		return "Point with X = "+x;
	}
}
