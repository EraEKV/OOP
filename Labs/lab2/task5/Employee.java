package task5;

public class Employee extends Person {
	private String position;
	private int canTakeCare = 3;
	
	public Employee(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }
	
	public int getOccupation() {
		return this.canTakeCare;
	}

	public void assignPet(Animal pet) throws Exception {
		if(getOccupation() >= pet.getCare()) {
			super.assignPet(pet);
		} else {
			throw new Exception("Can't take this type of pet coz busy");
		}
	}

    public String getPosition() {
        return position;
    }

    public void setPosition(String employeeId) {
        this.position = employeeId;
    }
	
    @Override
	public int hashCode() {
		int result = super.hashCode();
    	result = 31  * result + (position != null ? position.hashCode() : 0);
		return result;
	}
    
    @Override
	public boolean equals(Object o) {
    	if(this == o) return true;
    	if(!(o instanceof Employee)) return false;
    	
		Employee other = (Employee) o;
		
		return super.equals(other) && this.position.equals(other.position);
	}
	
	
	public String toString() {
		return super.toString() + 
				", position=" + position;
	}
}
