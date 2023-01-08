package Lesson10Classes;

import java.awt.Rectangle;

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
		//lecture10Slide19(); 
		lecture20Slide20();

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


	

}
