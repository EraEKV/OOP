package task1;

public class Person {
	private String name;
	private int age;
	
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
    
    public int hashCode() {
    	int result = 1;
    	result = 31  * result + (name != null ? name.hashCode() : 0);
    	result = 31  * result + age;
    	return result;
    }
    
    public boolean equals(Object o) {
    	if(o == this) return true;
    	if(!(o instanceof Person)) return false;
    	
    	Person other = (Person) o;
    	return age == other.age && name.equals(other.name);
    }
    
    public String toString() {
    	return "Person{" +
    			"name=" + name +
    			",age=" + age +
    			"}";
    }
}
