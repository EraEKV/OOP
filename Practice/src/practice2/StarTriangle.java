package practice2;

import java.util.Scanner;

public class StarTriangle {
	private int size;
	
	public StarTriangle(int size) {
		this.size = size;
	}
	
	public String toString() {
		StringBuilder triangle = new StringBuilder();
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j <= i; j++) {
				triangle.append("[*]");
			}
			triangle.append("\n");
		}
		
		return triangle.toString();
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		StarTriangle triangle = new StarTriangle(size);
		System.out.println(triangle.toString());
		
		input.close();
	}
}