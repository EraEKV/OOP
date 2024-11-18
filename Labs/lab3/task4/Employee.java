package task4;

import java.util.Date;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
	private double salary;
	private Date hireDate;
	private String insuranceNumber;
	
	public Employee() {

	}
	
	public Employee(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	
	public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}
	
	
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	public Date getHireDate() {
		return hireDate;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	
	
	@Override
	public int compareTo(Employee o) {
		if(this.salary > o.getSalary()) return 1;
		else if(this.salary < o.getSalary()) return -1;
		else if(this instanceof Manager && o instanceof Manager) {
			Manager m1 = (Manager) this;
            Manager m2 = (Manager) o;
            
            if(m1.getBonus() > m2.getBonus()) return 1;
            else if(m1.getBonus() < m2.getBonus()) return -1;
		}
		
		return 0;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee cloned = (Employee) super.clone();
		// coz Date is mutable  
        cloned.hireDate = (Date) this.hireDate.clone();
        return cloned;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Employee e = (Employee) o;
		
		return e.getHireDate() == this.hireDate &&
				e.getInsuranceNumber() == this.insuranceNumber &&
				e.getSalary() == this.salary;
	}
	
	@Override
	public int hashCode() {
		int res = super.hashCode();
		res = res + (int) salary;
		res = res * 31 + (hireDate != null ? hireDate.hashCode() : 0);
		res = res * 31 + (insuranceNumber != null ? insuranceNumber.hashCode() : 0);
		
		return res;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", salary: " + salary + ", hire date: " + hireDate + ", insurance number: " + insuranceNumber;
	}

	
}
