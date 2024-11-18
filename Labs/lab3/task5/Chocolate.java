package task5;

public class Chocolate implements Comparable<Chocolate> {
	private double weight;
	private String name;
	
	public Chocolate() {

	}
	
	public Chocolate(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	
	
	@Override
	public int compareTo(Chocolate o) {
		if(this.weight > o.weight) return 1;
		else if(this.weight > o.weight) return -1;
		return 0;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " name=" + name + ", weigth=" + weight;
	}	
}
