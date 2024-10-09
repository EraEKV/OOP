package task1;

public class ShapesTest {
	
	public static void main(String[] args) {
		Cube cube = new Cube(6);
		Sphere sphere = new Sphere(3);
		Cylinder cylinder = new Cylinder(3, 6);
		
		System.out.println(cube);
		System.out.println(sphere);
		System.out.println(cylinder);
	}
}
