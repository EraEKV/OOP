package task1;

public class Employee extends Person {
	private String employeeId;
	
	
	public Employee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
	
    @Override
	public int hashCode() {
		int result = super.hashCode();
    	result = 31  * result + (employeeId != null ? employeeId.hashCode() : 0);
		return result;
	}
    
    @Override
	public boolean equals(Object o) {
    	if(this == o) return true;
    	if(!(o instanceof Employee)) return false;
    	
		Employee other = (Employee) o;
		
		return super.equals(other) && this.employeeId.equals(other.employeeId);
	}
	
	
	public String toString() {
		return employeeId + " " + super.toString();
	}
}
