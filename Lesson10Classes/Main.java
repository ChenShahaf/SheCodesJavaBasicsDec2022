package Lesson10Classes;

import java.awt.Rectangle;
import java.util.Scanner;
import java.util.ArrayList;

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
		turnNumToText();
		//sepearteNum();
		
		
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
	/*
	 * Exercise 4 - write a program that takes a number and convert it to text
	 */
	public static void turnNumToText() {
		//STEP 1 - RECEIVE NUMBER
		int inputNum = receiveNum();
		//STEP 2 - CHECK RANGE, AND LOOPING UNTIL RANGE WILL BE OK
		boolean validRange = checkRangeOfNum(inputNum);
		while(validRange == false) {
			inputNum = receiveNum();
			validRange = checkRangeOfNum(inputNum);
		}
		//STEP 3 - CHECKING FOR NEGATIVE NUMBERS
		if(inputNum == 0) {
			System.out.println("The number: " + inputNum + " = is Zero");
		}
		while(inputNum < 0) {
			inputNum = checkNegativeNumbers(inputNum);
			if(inputNum > 0) {
				System.out.println("Number positive and in range");
			}
		}
		
		ArrayList<Integer> number = new ArrayList<>();
		
		while (inputNum > 0) {
			number.add(inputNum%10);
		    inputNum = inputNum / 10;		    
		}
		
		for(int i=0; i<number.size(); i++) {
			System.out.println(i + " " + number.get(i));
		}
		
		
		// STEP 4 CHECKING UNIT DIGIT
		int unitsDigit = number.get(0).intValue();
		String units = onesTextStorage(unitsDigit);
		String tens = tensTextStorage(number.get(1));
		String hunderds = hundersTextStorage(number.get(2));
		String thousand = thousandTextStorage(number.get(3));
		String tenThousand = tenThousandTextStorage(number.get(4));
		String hundredThousand = hunderdThousandTextStorage(number.get(5));
		String milion = milionThousandTextStorage(number.get(6));
		System.out.println("units: " + units + " tens: " + tens + " hundreds:" + hunderds
							+ " thousand: " + thousand + " tenThousand: " + tenThousand + 
							 " hundredThousand: " + hundredThousand + " milion: " + milion);
				
			
		
	}
	// -------HELPER FUNCTIONS 
	
	// STEP 1 - Reciveing number from user
	public static int receiveNum() {
		Scanner inputNum = new Scanner(System.in);
		System.out.println("Please enter a poistive number in range 0-1M: ");
		int num = inputNum.nextInt();
		return num;
	}
	
	//STEP 3 CREATING STRINGS FOR TEXTS FOR NAMES FROM 1 T0 MILLIOM
	public static String onesTextStorage(int number) {
		ArrayList<String> ones = new ArrayList<>();
		System.out.println(number);
		String unitString = "";
		ones.add("one");
		ones.add("two");
		ones.add("three");
		ones.add("four");
		ones.add("one");
		ones.add("five");
		ones.add("six");
		ones.add("seven");
		ones.add("eight");
		ones.add("nine");
		ones.add("zero");

		switch(number) {
		case 1:
			unitString =  ones.get(0).toString();
			break;
		case 2:
			unitString = ones.get(1).toString();
			break;
		case 3:
			unitString =  ones.get(2).toString();
			break;
		case 4:
			unitString = ones.get(3).toString();
			break;
		case 5:
			unitString = ones.get(4).toString();
			break;
		case 6:
			unitString = ones.get(5).toString();
			break;
		case 7:
			unitString = ones.get(6).toString();
			break;
		case 8:
			unitString =  ones.get(7).toString();
			break;
		case 9:
			unitString = ones.get(8).toString();
			break;
		case 0:
			unitString = ones.get(9).toString();
			break;
		}
		
		return unitString;
	}
	
	public static String tensTextStorage(Integer number) {
		ArrayList<String> tens = new ArrayList<>();
		tens.add("ten");
		tens.add("twenty");
		tens.add("thirty");
		tens.add("forty");
		tens.add("fifty");
		tens.add("sisxty");
		tens.add("seventy");
		tens.add("eighty");
		tens.add("ninety");
		
		String unitString = Integer.toString(number);
		
		switch(number) {
		case 1:
			unitString =  tens.get(0).toString();
			break;
		case 2:
			unitString = tens.get(1).toString();
			break;
		case 3:
			unitString =  tens.get(2).toString();
			break;
		case 4:
			unitString = tens.get(3).toString();
			break;
		case 5:
			unitString = tens.get(4).toString();
			break;
		case 6:
			unitString = tens.get(5).toString();
			break;
		case 7:
			unitString = tens.get(6).toString();
			break;
		case 8:
			unitString =  tens.get(7).toString();
			break;
		case 9:
			unitString = tens.get(8).toString();
			break;
		}
		return unitString;
	}
	
	public static String hundersTextStorage(Integer number) {
		String hundrends = onesTextStorage(number).toString();
		
		hundrends = hundrends + " hundrends";
		
		return hundrends;
	}
	
	public static String thousandTextStorage(Integer number) {
		String thousand = onesTextStorage(number);
		
		thousand = thousand + " thousands";
		
		return thousand;
	}
	public static String tenThousandTextStorage(Integer number) {
		String tenThousand = tensTextStorage(number);
		
		tenThousand = tenThousand + " thousands";
		
		return tenThousand;
	}
	public static String hunderdThousandTextStorage(Integer number) {
		String hunderdThousand = onesTextStorage(number);
		
		hunderdThousand = hunderdThousand + " hundred thousands";
		
		return hunderdThousand;
	}
	
	public static String milionThousandTextStorage(Integer number) {
		String milion = onesTextStorage(number);
		
		milion = milion + " milion";
		
		return milion;
	}
	// -------VALIDATION HELPER FUNCTIONS
	
	// VALIDATION 1- CHECKING NUMBER OF DIGITS IN NUMBER
	public static boolean checkRangeOfNum(int num) {
		boolean range = false;
		int numLength = (int) (Math.log10(num) + 1);
		if(numLength > 7) {
			System.out.println("You entered a number with more then 6 digits");
			range = false;
		}
		if(numLength <= 7 || numLength >= 0) {
			System.out.println("The range of the number is ok");
			range = true;
		}
		return range;
	}
	// VALIDATION 2 - CHECKING FOR NEGATIVE NUMBERS
	public static int checkNegativeNumbers(int num) {
		int correctNum=num;
		while(correctNum < 0) {
			System.out.println("Number cant be negative try again");
			correctNum = receiveNum();	
		}
		return correctNum;
	}
	

	public static void sepearteNum() {

		int num=1020; // int number


		while (num > 0) {

		    System.out.println( num % 10 );

		    num = num / 10;

		}

	}
	
	

	
	
	
	
}

