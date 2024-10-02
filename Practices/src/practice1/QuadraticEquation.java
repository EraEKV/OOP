package practice1;

import java.util.Scanner;

public class QuadraticEquation {

    private static double discriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }
    
    private static void solveQuadratic(double a, double b, double c) {
        double discriminant = discriminant(a, b, c);
        
        if (discriminant < 0) {
            System.out.println("Error: Discriminant is negative, no real roots.");
        } else {
            double sqrtD = Math.sqrt(discriminant);
            double root1 = (-b + sqrtD) / (2 * a);
            double root2 = (-b - sqrtD) / (2 * a);
            
            if (discriminant == 0) {
                System.out.println("The equation has one real root: " + root1);
            } else {
                System.out.println("The equation has two real roots: " + root1 + " and " + root2);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        
		System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();
        
        solveQuadratic(a, b, c);
        
        scanner.close();
    }
}
        		
        		
        		
        		