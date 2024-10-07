package task5;

import java.util.Vector;

public abstract class Person {
	private String name;
	private int age;
	Vector<Animal> pets = new Vector<>();
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void assignPet(Animal pet) throws Exception {
		pets.add(pet);
		if(pet.getOwner() == null) {
			pet.setOwner(this);
		}
	}
	
	public void removePet(Animal pet) {
		pets.remove(pet);
	}
	
	public boolean hasPet() {
		return pets.size() != 0;
	}
	
	public boolean getOccupation;
	
	public void leavePetWith(Person p) {
		Vector<Animal> petsCopy = new Vector<>(this.pets);
		for(Animal a : petsCopy) {
			try {
				p.assignPet(a);
				this.removePet(a);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public void retrievePetFrom(Person p) {
		Vector<Animal> petsCopy = new Vector<>(p.pets);
		for(Animal a : petsCopy) {
			if(a.getOwner() == this) {
				try {
					this.assignPet(a);
					p.removePet(a);
				} catch(Exception e) {
					System.out.println(e);
				}
			}
		}
	}
	
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
	
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Person)) return false;
		Person other = (Person) o;
		return name.equals(other.name) && age == other.age && pets == other.pets;
	}
	
	public int hashCode() {
		int result = 1;
		result = result * 31 + (name != null ? name.hashCode() : 0);
		result = result * 31 + age;
		result = result * 31 + (pets.size() != 0 ? pets.hashCode() : 0);
		return result;
	}
	
	public String toString() {
    	return "Person{" +
    			"name=" + name +
    			", age=" + age +
    			", pets=" + pets +
    			"}";
    }
}
