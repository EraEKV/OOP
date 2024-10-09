package task1;

public class Desktop extends Device {
	private int energyConsumption;
	
	public Desktop(String model, int year, int energyConsumption) {
		super(model, year);
		this.energyConsumption = energyConsumption;
	}
	
	
	public int getEnergyConsumption() {
		return this.energyConsumption;
	}
	
	public void setEnergyConsumption(int energyConsumption) {
		this.energyConsumption = energyConsumption;
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Desktop other = (Desktop) o;
		
		return this.energyConsumption == other.getEnergyConsumption();
	}
	
	public int hashCode() {
		int result = super.hashCode();
		result = result * 31 + this.energyConsumption;
		return result;
	}
	
	public String toString() {
		return super.toString() + ", Desktop[" +
				"EnergyConsumption=" + this.energyConsumption;
	}
}
