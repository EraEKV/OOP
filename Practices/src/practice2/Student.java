package practice2;

import java.util.Scanner;

public class Student {
    protected static int nextId = 1; 
    private final String name;
    private final int year;
    private final int id;
    
    Student(String name, int year) {
        this.name = name;
        this.year = year;
        this.id = nextId++;
    }

    public String toString() {
    	return "ID: " + id + ", Name: " + name + ", Year: " + year + '\n';
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = input.nextLine();
        
        System.out.print("Enter student's year: ");
        int year = input.nextInt();

        Student s1 = new Student(name, year);

        System.out.println(s1);
        
        input.close();
    }
}
