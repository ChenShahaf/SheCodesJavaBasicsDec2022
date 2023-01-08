package Lesson10Classes;

import java.util.Scanner;

public class Lion {
	static int height;
	static  int weight;
	static String colour;
	static double roarDecible;
	static int maneLength;
	/*
	 * Lecture 9 - Slide 15 - Can a Class contain an instance member of the 
	 * 				same type of itself? try to create inside the Lion class 
	 * 				a Lion instance and give it a value of an instance of another lion
	 * 
	 */
	static Lion lion;
	/*
	 * Lectrue 9 - Slide 16 - try to make a field in Lion class which is an int array and inialize in
	 * 
	 */
	static int[] lionIntArray; 
	
	
	
	/*
	
	
	/* Lecture 10 Slide 15 - Go Back to Class Lion you Created 
	 * * 						 1. Create a Constructore to the Class - Empty one
	 * 						 	 2. Create an Instance of a new Lion
	 				 	 		 3. Print to the Screen the new instance field
	 					         4. What is the value of colour field?  
	 Lecture 10-Slide 15 - Creating a Constructor
	*/
	/*
	 *  * Lecture 10 Slide 19 - 1. Create 2 New Constructors
	 *						 A. One Constructor One that will Recive all Paramteres
	 *					     B. One Constructor that Recieve Some of the Attributes
	 *						 2.In each of the Constructor write a print statement 
	 *						   to the screen so you could tell between the constructors
	 *						 3.go to main function and create 3 new instances 
	 *						  each instance will use the different constructors 
	 *						  MAKE SURE ALL THE DIFFERENT PRINT STATEMENT WERE PRINTED
	 */
	Lion(){
		System.out.println("This is the empty Constructor");
	}
	Lion(int h, int w, String lionColour, double rD, int mL){
		height = h;
		weight = w;
		colour = lionColour;
		roarDecible = rD;
		maneLength = mL;
		System.out.println("This is the Full fields Constructor");	
	}
	Lion(int h, int w, String lionColour){
		height = h;
		weight = w;
		colour = lionColour;
		System.out.println("This is the Semi fields Constructor");
	}
	Lion(Lion objLion, int[] lionArr){
		
		lion = objLion;
		lionIntArray = lionArr;
		System.out.println("This is the Lion Slide 20 Constructor");
		
	}
	
	void roar() {
		System.out.println("RRRoaRRR");
	}
	String hunt() {
		return "Rabbit";
	}
	/*
	 * Lecture 9 Slide 7 - Create a method in the Lion Class called Lion color 
	 * 					   which prints out the attribute colour of the lion 
	 * 						to the screen
	 */
	public void printColour() {
		System.out.println("Colour: " + colour);
	}
	/*
	 * Lecture 9- Slide 9 - Create a method that receives a new height parameter 
	 * 						to the lion field and update it
	 * 						Check the method in the Main class 
	 */
	public void setHeight(int newHeight) {
		height = newHeight;		
	}
	/*
	 * Lectrue 9 - Slide 16 - try to make a field in Lion class which is an int array and inialize in
	 * 
	 */
	public int[] setLionIntArray() {
		//WE REMEMBER THAT INT ARRAY HAS FIXED LENGTH
		lionIntArray = new int[4];
		System.out.println("Please initalize the lion array at fixed length of 4: ");
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 4 number one by another followed by enter each time: ");
		for(int i=0;i<lionIntArray.length;i++) {
			lionIntArray[i] = input.nextInt();
		}
		
		return lionIntArray;
	}
	public void printLionIntArray() {
		System.out.println("Lion int Array elements are: ");
		for(int i =0; i< lionIntArray.length;i++) {
			System.out.print(lionIntArray[i] + " ");
		}
		System.out.println();
	}
	//Lecture 9 - Slide 18- write toString Method 
	public static void toStringprintParameters() {	
		
		System.out.print("Lion[Height = " + height + ", Weight= " + weight + ", ");
		System.out.print("colour= " + colour + ", roarDecible= " + roarDecible);
		System.out.print(", maneLenght = " + maneLength);
		//System.out.print(", Lion = ");
		//lion.toString();
		System.out.println(" ,Lion ");
		printLionAttributes(lion);
		System.out.print(", lionIntArray = ");
		printLionArray();
		System.out.print("]");
	}
	public static void printLionArray(){
		System.out.print("[");
		for(int i=0; i<lionIntArray.length; i++) {
			System.out.print(lionIntArray[i] + ",");
		}
		System.out.print("]");
	}
	@Override
	public String toString() {
		return "Lion [height=" + height + ", weight=" + weight + ", colour=" + colour + ", roarDecible=" + roarDecible
				+ ", maneLength=" + maneLength + ", lion=" + lion + "]";
	}
	public static void printLionAttributes(Lion myLion) {
		String printLion;
		printLion =  " Lion [height=" + height + ", weight=" + weight + ", colour=" + colour + ", roarDecible=" + roarDecible
				+ ", maneLength=" + maneLength + ", lionIntArray = ";
		System.out.print(printLion);
		printLionArray();
		System.out.print("]");

	}

}
