package task4;

public abstract class Circuit {
	public abstract double getResistance();
	public abstract double getPotentialDiff();
	public abstract void applyPotentialDiff(double V);
	public double getPower() {
		double current = this.getCurrent();
		return current * current / getResistance();
	}
	public double getCurrent() {
		return getPotentialDiff() / getResistance();
	}
	
	public int hashCode() {
		int result = 1;
		result = result * 31 + (int) this.getCurrent();
		result = result * 31 + (int) this.getResistance();
		result = result * 31 + (int) this.getPotentialDiff();
		result = result * 31 + (int) this.getPower();
		
		return result;
	}
	
	public boolean equals(Object o) { 
		if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		Circuit other = (Circuit) o;
		return this.getResistance() == other.getResistance() && 
				this.getCurrent() == other.getCurrent() &&
				this.getPotentialDiff() == other.getPotentialDiff() &&
				this.getPower() == other.getPower();
	}
	
	public String toString() {
		return "Circuit[Power=" + getPower() + 
				", Current=" + getCurrent() + "]";
	}
}
