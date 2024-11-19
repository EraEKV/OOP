package task6;

public class Employee extends Person implements CareProvider, CanTakeHolidays {
	private String position;
	private int canTakeCare = 3;
	
	public Employee(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

	public void assignPet(Animal pet) throws Exception {
		if(canProvideCare(pet)) {
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
    	result = result * 31 + this.canTakeCare;
		return result;
	}
    
    @Override
	public boolean equals(Object o) {
    	super.equals(o);
    	
		Employee other = (Employee) o;
		
		return this.position.equals(other.position) && this.canTakeCare == other.canTakeCare;
	}
	
	
	public String toString() {
		return super.toString() + 
				", position=" + position;
	}

	@Override
	public boolean canProvideCare(Animal pet) {
        return this.canTakeCare >= pet.getCare();
    }

	@Override
	public boolean takeHoliday() {
		System.out.println("Went to Bali");
		return true;
	}
}
