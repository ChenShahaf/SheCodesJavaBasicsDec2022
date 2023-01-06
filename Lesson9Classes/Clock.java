package Lesson9Classes;

/*
 * Lecture 9 - Slide 12 -Getters and Setters
 * 
 * How to use geters and setters
 * 
 */


public class Clock {
	
	int hours;
	int minutes;

	
	public boolean setMinutes(int m) {
		boolean checkMin = false;
		if(m<0 || m > 60) {
			System.out.println("invalid minutes value");
			checkMin = false;
		}
		else checkMin = true;
		
		return checkMin;
	}
	
	public int getMinutes() {
		return minutes;
	}
}
