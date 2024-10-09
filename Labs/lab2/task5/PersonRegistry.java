package task5;

import java.util.HashSet;

public class PersonRegistry {
	HashSet<Person> people = new HashSet<>();
	
	public PersonRegistry() {
		
	}
	
	public void addPerson(Person p) {
		people.add(p);
	}
	
	public void removePerson(Person p) {
		people.remove(p);
	}
	
	public HashSet<Person> findPeopleWithPets() {
		HashSet <Person> res = new HashSet<>();
		for(Person p : people) {
			if(p.hasPet()) {
				res.add(p);
			}
		}
		return res;
	}
	
	public HashSet<Person> findPeopleWithoutPets() {
		HashSet <Person> res = new HashSet<>();
		for(Person p : people) {
			if(!p.hasPet()) {
				res.add(p);
			}
		}
		return res;
	}
	
	
	public String toString() {
		return people.toString();
	}
}
