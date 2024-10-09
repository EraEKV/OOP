package task5;

public class PhDStudent extends Person {
	private String proffeciency;
	private String direction;
	private int canTakeCare = 2;
	
	public PhDStudent(String name, int age, String proffeciency, String direction) {
        super(name, age);
        this.direction = direction;
        this.proffeciency = proffeciency;
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

    public String getProffeciency() {
        return proffeciency;
    }

    public void setgetProffeciency(String proffeciency) {
        this.proffeciency = proffeciency;
    }
    
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
	
    @Override
	public int hashCode() {
		int result = super.hashCode();
    	result = 31 * result + (proffeciency != null ? proffeciency.hashCode() : 0);
    	result = 31 * result + (direction != null ? direction.hashCode() : 0);
    	result = result * 31 + this.canTakeCare;
		return result;
	}
    
    @Override
	public boolean equals(Object o) {
    	super.equals(o);
    	
    	PhDStudent other = (PhDStudent) o;
		
		return this.proffeciency.equals(other.proffeciency) && 
				this.canTakeCare == other.getOccupation() && 
				this.direction.equals(other.direction) && 
				this.canTakeCare == other.getOccupation();
	}
	
	
	public String toString() {
		return super.toString() + 
				", profeciency=" + proffeciency + 
				", direction=" + direction;
	}
}
