package lab1;

import java.util.Scanner;

public class Temperature {
	private double degrees;
	private char scale;
	
	public Temperature() {
		
	}
	
	public Temperature(char scale) {
		this.scale = scale;
	}
	
	public Temperature(double degrees) {
		this.degrees = degrees;
	}
	
	public Temperature(double degrees, char scale) {
		this.scale = scale;
		this.degrees = degrees;
	}
	
	public boolean checkScale(char scale) {
		return this.scale == scale;
	}
	
	public void makeF() {
		if(checkScale('F')) {
			this.degrees = 9 * this.degrees * 5 + 32;
		}
	}
	
	public void makeC() {
		if(checkScale('C')) {
			this.degrees = 5 * (this.degrees - 32) / 9;
		}
	}
	
	
	public String toString() {
		return degrees + " " + scale;
	}
	
	public double getTemperature() {
		return degrees;
	}
	
	public void setTemperature(double degrees) {
		this.degrees = degrees;
	}
	

	public void setScale(char scale) {
		this.scale = scale;
	}
	
	public void setBoth(char scale, double degrees) {
		this.scale = scale;
		this.degrees = degrees;
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		
		in.close();
	}
}
