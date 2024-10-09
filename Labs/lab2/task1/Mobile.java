package task1;

public class Mobile extends Device {
	private int battery;
	
	public Mobile(String model, int year, int battery) {
		super(model, year);
		this.battery = battery;
	}
	
	public int getBattery() {
		return this.battery;
	}
	
	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Mobile other = (Mobile) o;
		
		return this.battery == other.getBattery();
	}
	
	public int hashCode() {
		int result = super.hashCode();
		result = result * 31 + this.battery;
		return result;
	}
	
	
	public String toString() {
		return super.toString() + ", Mobile[" +
				"Battery=" + this.battery;
	}
	
}
