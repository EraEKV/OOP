package practice3;

import java.util.Random;
import java.util.Scanner;

public class testPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Point p1 = new Point(in.nextInt());
		Point p2 = new Point(in.nextInt());
		
		System.out.println(p1.getDistance(p2));
		System.out.println(Point.getDistance(p1, p2));
		
		int distance = Point.getDistance(new Point(8), new Point(10));
		System.out.println(distance);
		
		Random r = new Random();
		Point p3 = new Point(r.nextInt(1000));
		Point p4 = new Point(r.nextInt(1000));
		int distance2 = Point.getDistance(p3,p4);
		System.out.println("Distance between "+ p3 + " and "+p4+ " is "+distance2);
		//printing p3 is the same as printing ps.toString()
		in.close();
	}

}
