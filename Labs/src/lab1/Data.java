package lab1;

public class Data {
	private int size;
	private double sum;
	private double maxNum;
	
	
	public Data() {
		this.size = 0;
	}
	
	public void add(int n) {
		size++;
		sum += n;
		if(n > maxNum) maxNum = n;
	}
	
	public double getAvg() {
		return size < 1 ? 0.0 : sum / size;
	}
	
	public double getMax() {
		return maxNum;
	}
	
	public String toString() {
		return "";
	}
}
