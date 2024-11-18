package task4;

public abstract class Person {
	private String name;
	
	public Person() {

	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || o.getClass() != this.getClass()) return false;
		
		Person p = (Person) o;
		return name == p.getName();
	}
	
	@Override
	public int hashCode() {
		int res = 31;
		res = res * 31 + (name != null ? name.hashCode() : 0);
		
		return res;
	}
	
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " name: " + name;
	}
}
