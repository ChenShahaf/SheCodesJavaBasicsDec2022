package Lesson10Classes;


/*
 * Lecture 20 Slide 28 Question 1 - Point Class
 */
public class Point {
	
	int x;
	int y;
	
	//Constructor 
	 Point(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
	 
	 void printPoint() {
		 System.out.println("(" + x + "," + y + ")");
	 }
	 //Method that receives a Point object and return a Point
	 Point center(Point other) {
	        // Returns the center between this point the other point
	        // Notice we are using integer, we won't get an accurate value
	        return new Point((x + other.x) / 2, (y + other.y) / 2);
	    }
	 /*
		 * Write a new method in Point called scale,
		 * that will make the point closer by half to (0,0).
		 * So for example, point (8, 4) after scale will be (4, 2).
		 */
	 Point scale() {
		 x  = x - x/2;
		 y = y - y/2;
		 Point result = new Point(x,y);
		 return result;
	 }
	 void print() {
		 System.out.println("X: " + x + " Y: " + y);
		 
	 }
	 

}
