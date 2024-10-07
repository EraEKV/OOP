package task5;

import java.util.Vector;

public class PersonRegistry {
	Vector<Person> people = new Vector<>();
	
	public PersonRegistry() {
		
	}
	
	public void addPerson(Person p) {
		people.add(p);
	}
	
	public void removePerson(Person p) {
		people.remove(p);
	}
	
	public Vector<Person> findPeopleWithPets() {
		Vector <Person> res = new Vector<>();
		for(Person p : people) {
			if(p.hasPet()) {
				res.add(p);
			}
		}
		return res;
	}
	
	public Vector<Person> findPeopleWithoutPets() {
		Vector <Person> res = new Vector<>();
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
