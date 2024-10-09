package task5;

public abstract class Animal {
	private String name;
	private int age;
	private Person owner = null;
	private int requireALotOfCare;
	
	public Animal() {
		
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getSound;
	
	public void setCare(int care) {
		this.requireALotOfCare = care;
	}
	
	public int getCare() {
		return this.requireALotOfCare;
	}
	
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Animal)) return false;
		Animal other = (Animal) o;
		return this.name.equals(other.name) && 
				this.age == other.getAge() &&
				this.owner == other.getOwner() &&
				this.requireALotOfCare == other.requireALotOfCare;
	}
	
	public int hashCode() {
		int result = 1;
		result = result * 31 + (name != null ? name.hashCode() : 0);
		result = result * 31 + age;
		result = result * 31 + requireALotOfCare;
		return result;
	}
	
	public String toString() {
    	return "Animal[" +
    			"name=" + name +
    			",age=" + age +
    			"]";
    }
}
