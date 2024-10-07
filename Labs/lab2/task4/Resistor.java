package task4;

public class Resistor extends Circuit {
	private double resistance;
	private double V;
	
	public Resistor() {
		
	}
	
	public Resistor(double resistance) {
		this.resistance = resistance;
	}
	
	public double getResistance() {
		return this.resistance;
	}
	

	@Override
	public double getPotentialDiff() {
		return this.V;
	}
	
	@Override
	public void applyPotentialDiff(double V) {
		this.V = V;
	}
	
	public String toString() {
		return super.toString() + "Resistor[Resistance=" + this.resistance + 
				", Potential difference=" + V + "]";
	}
}
