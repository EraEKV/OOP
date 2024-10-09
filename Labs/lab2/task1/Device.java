package task1;

public class Device {
	private String model;
	private int year;

	public Device() {
		
	}
	
	public Device(String model, int year) {
		this.model = model;
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	
	public int hashCode() {
    	int result = 1;
    	result = 31  * result + (model != null ? model.hashCode() : 0);
    	result = 31  * result + year;
    	return result;
    }
    
    public boolean equals(Object o) {
    	if(o == null) return false;
    	if(o == this) return true;
    	if(!(o instanceof Device)) return false;
    	
    	Device other = (Device) o;
    	return year == other.getYear() && model.equals(other.getModel());
    }
    
    public String toString() {
    	return "Device[" +
    			"model=" + model +
    			",year=" + year +
    			"]";
    }
}
