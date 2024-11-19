package task4;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee implements Comparable<Employee>, Cloneable {
	private double bonus;
	
	private Vector <Employee> employees;
	
	public Manager() {
		
	}
	
	public Manager(String name, double salary, Date hireDate, String insuranceNumber, double bonus) {
		super(name, salary, hireDate, insuranceNumber);
		this.employees = new Vector<>();
		this.bonus = bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	
	
	public void addEmployee(Employee e) {
		employees.add(e);
	}
	
	public void removeEmployee(Employee e) {
		employees.remove(e);
	}
	
	public void removeEmployee(String insuranceNumber) {
		employees.remove(new Employee(insuranceNumber));
	}
	
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Manager cloned = (Manager) super.clone();
//        deep clonning
        cloned.employees = new Vector<>();
        for (Employee emp : this.employees) {
            cloned.employees.add((Employee) emp.clone());
        }
        
        return cloned;
	}
	
	
	
	@Override
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		
		Manager m = (Manager) o;
		
		if (this.employees.size() != m.employees.size()) return false;
		
		for(Employee e : employees) {
			if(!m.employees.contains(e)) return false;
		}
		
		return true;
	}
	
	@Override
	public int hashCode() {
		int res = super.hashCode();
		res = res * 31 + (int) bonus;
		
		return res;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", bonus: " + bonus;
	}

}
