package lab1;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class Analyzer {
	
	

	public static void main(String[] args) {
		Data data = new Data();
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter number (Q to quit): ");
			String val = in.next();
			
			if(val.equals("Q")) {
				System.out.println("Average = " + data.getAvg());
				System.out.println("Maximum = " + data.getMax());
				break;
			} else {
				try {
					int number = Integer.parseInt(val);
					data.add(number);
				} catch(NumberFormatException err) {
					System.err.println("Enter only numbers or 'Q' for quit");
				}
			}
		}
		
		in.close();

	}

}
