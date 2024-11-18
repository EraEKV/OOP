package task5;

import java.util.Date;

import task4.Employee;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("=== Sorting Chocolates ===");
        Chocolate[] chocolates = {
            new Chocolate("Twix", 50.0),
            new Chocolate("Snickers", 48.0),
            new Chocolate("Mars", 51.0),
            new Chocolate("Bounty", 45.5)
        };
        
        System.out.println("Before bubble sort:");
        printArray(chocolates);
        Sort.bubbleSort(chocolates);
        System.out.println("After bubble sort:");
        printArray(chocolates);


        
        System.out.println("\n=== Sorting Times ===");
        Time[] times = {
            new Time(14, 30, 00),
            new Time(9, 15, 00),
            new Time(14, 15, 00),
            new Time(23, 59, 00)
        };
        
        System.out.println("Before bubble sort:");
        printArray(times);
        Sort.bubbleSort(times);
        System.out.println("After bubble sort:");
        printArray(times);


        
        System.out.println("\n=== Sorting Employees ===");
        Employee[] employees = {
            new Employee("John Doe", 50000, new Date(), "IN123456"),
            new Employee("John Doe", 50000, new Date(), "IN123456"),
	        new Employee("Jane Smith", 55000, new Date(), "IN789012")
        };
        
        System.out.println("Before bubble sort:");
        printArray(employees);
        Sort.bubbleSort(employees);
        System.out.println("After bubble sort:");
        printArray(employees);
    }
    
    private static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
        System.out.println();
    }
}
