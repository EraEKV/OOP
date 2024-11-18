package task6;

import java.util.HashSet;

public abstract class Person {
	private String name;
	private int age;
	HashSet<Animal> pets = new HashSet<>();
	
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
	
//	public boolean checkForNeighbor(Animal animal) {
//		return animal instanceof Cat ? !pets.contains(new Dog()) 
//				: !pets.contains(new Cat());
//	}
	
	
	public boolean checkForNeighbor(Dog dog) {
		for(Animal pet : pets) {
			if(pet instanceof Cat) return false;
		}
		return true;
	}
	
	public boolean checkForNeighbor(Cat cat) {
		for(Animal pet : pets) {
			if(pet instanceof Dog) return false;
		}		
		return true;
	}
	
	public void leavePetWith(Person p) {
		HashSet<Animal> petsCopy = new HashSet<>(this.pets);
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
		HashSet<Animal> petsCopy = new HashSet<>(p.pets);
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
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		Person other = (Person) o;
		return name.equals(other.name) && age == other.age && pets == other.pets;
	}
	
	public int hashCode() {
		int result = 1;
		result = result * 31 + (name != null ? name.hashCode() : 0);
		result = result * 31 + age;
		return result;
	}
	
	public String toString() {
    	return "Person[" +
    			"name=" + name +
    			", age=" + age +
    			", pets=" + pets +
    			"]";
    }
}
