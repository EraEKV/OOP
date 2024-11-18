package task4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TestWork {
	 public static void main(String[] args) {
	        testEmployeeBasics();
	        testManagerBasics();
	        testCloning();
	        testComparisons();
	        testSorting();
	    }

	    private static void testEmployeeBasics() {
	        System.out.println("\n=== Testing Employee Basics ===");
	        
	        Employee emp1 = new Employee("John Doe", 50000, new Date(), "IN123456");
	        Employee emp2 = new Employee("John Doe", 50000, new Date(), "IN123456");
	        Employee emp3 = new Employee("Jane Smith", 55000, new Date(), "IN789012");
	        
	        System.out.println("Employee toString: " + emp1);
	        
	        System.out.println("Same employees equal: " + emp1.equals(emp2));
	        System.out.println("Different employees equal: " + emp1.equals(emp3));
	    }
	    
	    private static void testManagerBasics() {
	        System.out.println("\n=== Testing Manager Basics ===");
	        
	        Manager mgr1 = new Manager("Alice Manager", 80000, new Date(), "IN999999", 10000);
	        Manager mgr2 = new Manager("Alice Manager", 80000, new Date(), "IN999999", 10000);
	        
	        Employee emp1 = new Employee("Bob Employee", 50000, new Date(), "IN123456");
	        mgr1.addEmployee(emp1);
	        mgr2.addEmployee(emp1);
	        
	        System.out.println("Manager toString: " + mgr1);
	        
	        System.out.println("Same managers equal: " + mgr1.equals(mgr2));
	    }
	    
	    private static void testCloning() {
	        System.out.println("\n=== Testing Cloning ===");
	        
	        try {
	            Date hireDate = new Date();
	            Employee originalEmp = new Employee("Test Employee", 60000, hireDate, "IN111111");
	            Employee clonedEmp = (Employee) originalEmp.clone();
	            
	            System.out.println("Original employee: " + originalEmp);
	            System.out.println("Cloned employee: " + clonedEmp);
	            System.out.println("Are they equal? " + originalEmp.equals(clonedEmp));
	            System.out.println("Are they the same object? " + (originalEmp == clonedEmp));
	            
	            hireDate.setTime(hireDate.getTime() + 86400000); // +1 day
	            System.out.println("After changing original hire date:");
	            System.out.println("Original employee: " + originalEmp);
	            System.out.println("Cloned employee: " + clonedEmp);
	            
	            Manager originalMgr = new Manager("Test Manager", 90000, new Date(), "IN222222", 15000);
	            originalMgr.addEmployee(originalEmp);
	            
	            Manager clonedMgr = (Manager) originalMgr.clone();
	            System.out.println("\nOriginal manager: " + originalMgr);
	            System.out.println("Cloned manager: " + clonedMgr);
	            
	        } catch (CloneNotSupportedException e) {
	            System.out.println("Cloning failed: " + e.getMessage());
	        }
	    }

	    private static void testComparisons() {
	        System.out.println("\n=== Testing Comparisons ===");
	        
	        Employee emp1 = new Employee("John", 50000, new Date(), "IN111");
	        Employee emp2 = new Employee("Jane", 60000, new Date(), "IN222");
	        Manager mgr1 = new Manager("Alice", 80000, new Date(), "IN333", 10000);
	        Manager mgr2 = new Manager("Bob", 80000, new Date(), "IN444", 15000);
	        
	        System.out.println("emp1 compareTo emp2 (lower salary): " + emp1.compareTo(emp2));
	        System.out.println("emp2 compareTo emp1 (higher salary): " + emp2.compareTo(emp1));
	        System.out.println("mgr1 compareTo mgr2 (same salary, lower bonus): " + mgr1.compareTo(mgr2));
	    }
	    
	    private static void testSorting() {
	        System.out.println("\n=== Testing Sorting ===");
	        
	        List<Employee> employees = new ArrayList<>();
	        
	        Calendar cal = Calendar.getInstance();
	        
	        cal.set(2023, 0, 1); // 1 января 2023
	        employees.add(new Employee("Charlie", 55000, cal.getTime(), "IN111"));
	        
	        cal.set(2023, 1, 1); // 1 февраля 2023
	        employees.add(new Employee("Alice", 65000, cal.getTime(), "IN222"));
	        
	        cal.set(2023, 2, 1); // 1 марта 2023
	        employees.add(new Employee("Bob", 45000, cal.getTime(), "IN333"));


	        Collections.sort(employees);
	        System.out.println("\nSorted by salary:");
	        employees.forEach(System.out::println);
	        
	        Collections.sort(employees, new EmployeeNameComparator());
	        System.out.println("\nSorted by name:");
	        employees.forEach(System.out::println);


	        Collections.sort(employees, new EmployeeHireDateComparator());
	        System.out.println("\nSorted by hire date:");
	        employees.forEach(System.out::println);
	    }
}
