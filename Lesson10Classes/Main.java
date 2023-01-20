package Lesson10Classes;

import java.awt.Rectangle;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		//STEP 1 LECTURE 10 SLIDE 10
		//Lecture10Slide10();
		//STEP 2 LECTURE 10 SLIDE 12
		//Lecture10Slide12();
		//STEP 3 - LECTURE 10 SLIDE 15
		//lecture10Slide15();
		//STEP 4- LECTURE 10 SLIDE 19
		//lecture10Slide19(); 
		//STEP 5 - LECTURE 10 SLIDE 20
		//lecture20Slide20();
		//STEP 6 - LECTURE 10 SLIDE 28 QUESTION 1
		//lecture20Slide28Question1();
		//Lecture 20 Slide 28 Question 2
		//lecture20Slide28Question2Ex3(); 
		//lecture20Slide28Question2Ex4();
		//lecture20Slide28Question2Ex5();
		//lecture20Slide28Question3Ex1();
		//lecture20Slide28Question3Ex2();
		 //lecture20Slide28Question3Ex3();
		//lecture20Slide28Question3Ex5();
		//sepearteNum();
		NumbersToText.startProgramm(); 
		
		
	}
	
	
	/*
	 * Lecture 10 Slide 10 - Solve Question 1 from this link
	 * 
	 * Question 1 -
	 * What's wrong with the following program?

		public class SomethingIsWrong {
    		public static void main(String[] args) {
        		Rectangle myRect;
        		myRect.width = 40;
        		myRect.height = 50;
        		System.out.println("myRect's area is " + myRect.area());
    		}
		}

	 * 
	 */
	public static void Lecture10Slide10() {
		/*
		 * To fix the problem we need a declration of the object myRect 
		 * int order to use methods on it otherwise it might be initalize to null
		 * 
		 */
		Rectangle myRect = new Rectangle();
		myRect.width = 40;
		myRect.height = 50;
		System.out.println("myRect's area is " + area(myRect.width,myRect.height));
	}
	//HELPER FUNCTION TO QUESTION 1 (LECTURE 10 SLIDE 10)
	public static int area(int width, int height) {
		return width*height;
	}
	
	//Lecture 10 Slide 12 -LET'S DO ALL THIS YOUTUBE PART IN A HELPER FUNCTION
	public static void Lecture10Slide12() {
		Dog jerome = new Dog("Jerome", "Golden Retriever");
		Dog henry = new Dog("Henry", "Pitbull");
		System.out.println("Jerome parameters: " + jerome.toString());
		System.out.println("Jerome parameters: " + henry.toString());
	}
	/*
	 * * Lecture 10 Slide 15 - Go Back to Class Lion you Created 
	 * 						 1. Create a Constructore to the Class - Empty one
	 * 						 2. Create an Instance of a new Lion
	 * 						 3. Print to the Screen the new instance field
	 * 						 4. What is the value of colour field?  
	 *
	 */
	public static void lecture10Slide15() {
		Lion lionDefult = new Lion();
		//Lion new colour is Null
		System.out.println("New Lion parameters are: " + lionDefult.toString());
		System.out.println("New Lion colour is: " + lionDefult.colour);
		
	}
	/* Lecture 10 Slide 19 - 1. Create 2 New Constructors
	 *						 A. One Constructor One that will Recive all Paramteres
	 *					     B. One Constructor that Recieve Some of the Attributes
	 *						 2.In each of the Constructor write a print statement 
	 *						   to the screen so you could tell between the constructors
	 *						 3.go to main function and create 3 new instances 
	 *						  each instance will use the different constructors 
	 *						  MAKE SURE ALL THE DIFFERENT PRINT STATEMENT WERE PRINTED
	 */
	public static void lecture10Slide19() {
		Lion lionEmpty = new Lion();
		System.out.println("The lionEmpty parameters are: " + lionEmpty.toString());
		Lion fullLion = new Lion(150,3250,"Orange", 120.0, 6);
		System.out.println("The fullLion parameters are: " + fullLion.toString());
		Lion semiLion = new Lion(130, 3500, "Brown");
		System.out.println("The semiLion parameters are: " + semiLion.toString());
	}
	public static void lecture20Slide20() {
		Lion lion1 = new Lion(150,3250,"Orange", 120.00, 6);
		System.out.println("The lion1 parameters are: " + lion1.toString());
		int[] array = {1,2,3,4};
		Lion lion2 = new Lion(lion1, array); 
		System.out.println("The lionSemi parameters are: ");
		lion2.toStringprintParameters();
		}
	public static void lecture20Slide28Question1() {
		Point p = new Point(32, 32);
		for (int i = 0; i < 5; i++) {
			p.scale();
			p.print();
		}
	}
	public static void lecture20Slide28Question2Ex3() {
		/*
		 * public class MyClass {
  			int x = 5;

  		public static void main(String[] args) {
   		MyClass myObj = new MyClass();
    	System.out.println(    .  );
    	  }
		}
		 */
		MyClass myObj = new MyClass();
    	System.out.println(myObj.x);
	}
	public static void lecture20Slide28Question2Ex4() {
		/*
		 * public class MyClass {
  		   public void myMethod() {
    		System.out.println("Hello World");
  			}

  			public static void main(String[] args) {
    		MyClass myObj = new MyClass();

    		Call myMethod on the object.
    		______._____();

		*/
		MyClass myObj = new MyClass();
    	myObj.myMethod();
	}
	public static void lecture20Slide28Question2Ex5() {
		/*
		 * // Create a MyClass class
			public class ____{
				  int __; // Create a class attribute x
			// Create a class constructor for the MyClass class
			public _____(){
				x = ____; // Set the initial value for the class attribute x to 5
			}

  		public static void main(String[] args) {
    	// Create an myObj object of class MyClass (This will call the constructor)
    	MyClass ____ = new MyClass(); 
    	// Print the value of x
    	 System.out.println(_____.____);
    	 }
	 */
	//Since in ex 3 we used x in this ex we will use y.	
		MyClass myObj = new MyClass();
		System.out.println(myObj.y);
	}
	public static void lecture20Slide28Question3Ex1() {
		//Predict the output?
		/*
		 * package main;
		
			class T {
  			  int t = 20;
			}
			class Main {
   			  public static void main(String args[]) {
      		  	T t1 = new T();
      			System.out.println(t1.t);
   			  }
			}
		 */
		T t1 = new T();
		System.out.println(t1.t);	
	}
	
	public static void lecture20Slide28Question3Ex2() {
		//Predict the output of following Java program
		/*
		 * class T {
  			int t = 20;
  			T() {
    			t = 40;
  			}
		}
		class Main {
   			public static void main(String args[]) {
      		T t1 = new T();
     		System.out.println(t1.t);
   		   }
		}
		 */
		T t1 = new T();
		System.out.println(t1.t);	
	}
	public static void  lecture20Slide28Question3Ex3() {
		//Which of the following is/are true about constructors in Java?
		/*
		 * 1) Constructor name should be same as class name.
		   2) If you don't define a constructor for a class, 
    		 a default parameterless constructor is automatically
    		 created by the compiler. 
		   3) The default constructor calls super() and initializes all 
   			  instance variables to default value like 0, null.
		   4) If we want to parent class constructor, it must be called in 
   			 first line of constructor.
		 */
		System.out.println("All answers are correct");
	}
	public static void lecture20Slide28Question3Ex4() {
		//Is there any compiler error in the below Java program? 
		/*class Point {
    		int m_x, m_y; 
    		public Point(int x, int y) {
    		    m_x = x;    
    		    m_y = y;  
    		}
    
    		public static void main(String args[]){ 
      			Point p = new Point();
    		}
		 }
		 * 
		 */
		//As we can wee there is a complier error since the cnstructor require
		// to add int values of X and Y values hence the empty cnstsructor eill not be
		//applied here
		//Point2 p = new Point2();
		
		//to fix we will add x and y
		Point2 p = new Point2(5,2);
	}
	public static void lecture20Slide28Question3Ex5() {
		//Output of following Java program
		/*
		 * class Point {
  			int m_x, m_y;
   
  			public Point(int x, int y) { m_x = x; m_y = y; }
  			public Point() { this(10, 10); }
  			public int getX() { return m_x; }
  			public int getY() { return m_y; }
   
  			public static void main(String args[]) {
    		Point p = new Point();
    		System.out.println(p.getX());
  			}
		} 
		 */
		Point2 p = new Point2();
	    System.out.println(p.getX());
	}
	

}

