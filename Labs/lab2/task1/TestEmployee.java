package task1;

import java.util.HashSet;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 30, "A12");
        Employee emp2 = new Employee("Bob", 25, "A13");
        Employee emp3 = new Employee("Alice", 30, "A12");

        HashSet<Employee> employees = new HashSet<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("Total unique employees: " + employees.size());
    }
}
