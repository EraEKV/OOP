package task1;

public abstract class Shape3D {
	public abstract double volume();
	
	public abstract double surfaceArea();
	
	public String toString() {
		return this.getClass().getName() + "volume " + this.volume() + " surface area " + this.surfaceArea();
	}
}
