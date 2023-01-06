package Lesson9Classes;

import java.util.Scanner;

public class Lion {
	int height;
	int weight;
	String colour;
	double roarDecible;
	int maneLength;
	
	/*
	 * Lecture 9 - Slide 15 - Can a Class contain an instance member of the 
	 * 				same type of itself? try to create inside the Lion class 
	 * 				a Lion instance and give it a value of an instance of another lion
	 * 
	 */
	Lion lion;
	/*
	 * Lectrue 9 - Slide 16 - try to make a field in Lion class which is an int array and inialize in
	 * 
	 */
	int[] lionIntArray; 
	
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
	@Override
	public String toString() {
		return "Lion [height=" + height + ", weight=" + weight + ", colour=" + colour + ", roarDecible=" + roarDecible
				+ ", maneLength=" + maneLength + ", lion=" + lion + "]";
	}
	
	

}
