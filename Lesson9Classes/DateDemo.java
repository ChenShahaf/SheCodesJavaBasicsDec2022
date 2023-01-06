package Lesson9Classes;

/*
 * Lecture 9 - Slide 11 - Learning Getters and Setters
 */

public class DateDemo {
	
	private int day;
	private int month;
	private int year;
	
	public DateDemo() {}
	
	@Override
	public String toString() {
		return "DateDemo [getDay()=" + getDay() + ", getMonth()=" + getMonth() + ", getYear()=" + getYear() + "]";
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public DateDemo(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	

}
