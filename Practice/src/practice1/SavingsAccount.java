package practice1;

import java.util.Scanner;

public class SavingsAccount {

	private static double calculateNewBalance(double balance, double interestRate) {
        return balance + (balance * interestRate / 100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter the interest rate (%): ");
        double interestRate = scanner.nextDouble();

        double newBalance = calculateNewBalance(balance, interestRate);
        System.out.println("New balance after adding interest: " + newBalance);
        
        scanner.close();
    }
}