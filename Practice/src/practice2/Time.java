package practice2;

import java.util.Scanner;

public class Time {
	private int hour;
	private int minute;
	private int second;
	private String type = null;
	
	Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void showTime() {
		System.out.println(hour + ":" + minute + ":" + second + " " + type);
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second + " " + type;
	}
	
	public void toStandard() {
		if(type == null) {
			if(hour >= 12) {
				hour -= 12;
				type = "PM";
			} else {
				type = "AM";
			}
		}
		showTime();
	}
	
	public void toUniversal() {
		if(type != null) {
			if(type == "PM") {
				hour += 12;
			}
			type = null;
		}
		showTime();
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int hour = input.nextInt();
		int minute = input.nextInt();
		int second = input.nextInt();
		
		
		if(hour > 24 || minute > 60 || second > 60 || hour < 0 || second < 0 || minute < 0) {
			System.out.println("Incorrect for of input time");
			input.close();
			return;
		} 

		Time time = new Time(hour, minute, second);
		time.toStandard();
		time.toUniversal();
		
		input.close();
	}
}
