package practice3;

import java.util.Scanner;

public class Time {
	private static int hour;
	private static int minute;
	private static int second;
	private static String type = null;
	
	public Time() {
		
	}
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public static void showTime() {
		System.out.println(hour + ":" + minute + ":" + second + " " + type);
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second + " " + type;
	}
	
	public static void toStandard() {
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
	
	public static void toUniversal() {
		if(type != null) {
			if(type == "PM") {
				hour += 12;
			}
			type = null;
		}
		showTime();
	}
	
	public Time getTime() {
		return this;
	}
	
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int hour = input.nextInt();
		int minute = input.nextInt();
		int second = input.nextInt();
		
		
		if(hour > 24 || minute > 60 || second > 60 || hour < 0 || second < 0 || minute < 0) {
			System.out.println("Incorrect for of input time");
			return;
		} 

		Time time = new Time(hour, minute, second);
		time.toStandard();
		time.toUniversal();
		
		input.close();
	}
}
