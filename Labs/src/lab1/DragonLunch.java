package lab1;

import java.util.Vector;

public class DragonLunch {
	private Vector <Person> deathList = new Vector<>();
	
	public DragonLunch() {
		
	}
	
	public DragonLunch(Vector<Person> peopleList) {
		this.deathList = peopleList;
	}
		
	public void kidnap(Person p) {
		this.deathList.add(p);
	}
	
	public boolean willDragonEatOrNot() {
		if(this.deathList.isEmpty()) {
			return false;
		}
		
		int leftPointer = 0;

		for (int rightPointer = 0; rightPointer < this.deathList.size(); rightPointer++) {
			if (leftPointer > 0 && this.deathList.get(leftPointer - 1).getGender() == Gender.BOY
					&& this.deathList.get(rightPointer).getGender() == Gender.GIRL) {
				leftPointer--;
			} else {
				deathList.set(leftPointer, deathList.get(rightPointer));
				leftPointer++;
			}
		}

		return leftPointer > 0;
	}
	
	
	public String toString() {
		String output = "This dragon will ";
		if (!this.willDragonEatOrNot())
			output += "not ";
		output += "eat students today!";
		return output;
	}
}
