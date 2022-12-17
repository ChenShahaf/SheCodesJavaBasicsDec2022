package Lesson4Loops;

import java.util.Scanner;

public class Lesson4Loops {

	public static void main(String[] args) {
		Ex1();
		Ex2sumTo1000(); 
		Ex3divideBy2();
		Ex3printTo10();
		quizPrintAnX();
	}
	
	public static void Ex1() {
		System.out.println("Excersise 1- examples");
		//Example 1 - Print i as long as i is less than 6.
		System.out.println("Example 1 - Print i as long as i is less than 6.");
		int i = 1;
		while(i < 6) {
			System.out.println(i);
			i++;
		}
		//Example 2 - Use the do/while loop to print i as long as i is less than 6.
		System.out.println("Example 2 - Use the do/while loop to print i as long as i is less than 6.");
		int j=1;
		do {
			System.out.println(j);
			j++;
		}
		while(j<6);
		//Example 3 - Use a for loop to print "Yes" 5 times:
		System.out.println("Example 3 - Use a for loop to print \"Yes\" 5 times");
		for(int k = 0; k<5; k++) {
			System.out.println( k + 1 + " Yes");
		}
		System.out.println("Example 4 - Loop through the items in the cars array.");
		//Example 4 - Loop through the items in the cars array.
		String[] cars = {"Volvo", "BMW", "Ford"};
		for(String t: cars) {
			System.out.println(t);
		}
		System.out.println("Example 5 - Stop the loop if i is 5.");
		//Example 5 - Stop the loop if i is 5.
		for(int y = 0; y<10; y++) {
			if(y == 5) {
				break;
			}
			System.out.println(y);
		}
		//Example 6 - In the loop, when the value is "4",
		//            jump directly to the next value.
		System.out.println("Example 6");
		System.out.println("In the loop, when the value is \"4\",");
		System.out.println("jump directly to the next value.");
		for(int r = 0; r<10; r++) {
			if(r == 4) {
				continue;
			}
			System.out.println(r);
		}
	}
	public static void Ex2sumTo1000() {
		/*
		 * write a program that sums up all the numbers from 1 to 10000
		 * and type that sum to the screen
		 */
		System.out.println("Excersise 2 sum up 1 to 1000");
		//Step 1 - initialize the sum to zero
		int sum = 0;
		//run through the loop from 1 to 1000 to sum the numbers
		for(int i=1; i<=1000; i++) {
			sum+= i;
		}
		//printing the sum to the screen
		System.out.println("The sum of numbers from 1 to 1000 is: " + sum);
	}
	public static void Ex3divideBy2() {
		/*
		 * Write a program using while loop that divide the number 1024
		 * by 2 each time until reaching to 1 
		 * 
		 * The output should look like this:
		 * 	1024
		 * 	512
		 *  .
		 *  .
		 *  .
		 *  4
		 *  2
		 *  1
		 */
		System.out.println("Excersise 3 divde 1024 by 2 to 1");
		//Assigning the first number
		int number = 1024;
		while(number > 0) {
			System.out.println(number);
			number = number/2;
		}
	}
	public static void Ex3printTo10() {
		System.out.println("Excerise Debugger run loop typing 1-10 and debug");
		for(int i = 1; i<=10;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	
	}
	public static void quizPrintAnX(){
		System.out.println("Quiz question print an X");
		//we will first create a scanner object to receive the number of rows
		//and the char for the X pattern
		//Import scanner statement at the top of the page
		Scanner input = new Scanner(System.in);
		//Prompting the user to give us the number of rows he wants 
		System.out.println("Please enter the number of rows followed by enter key.");
		int size  = input.nextInt();
		//The X pattern only works for Odd numbers so we will validate that information
		while(size%2 == 0) {
			System.out.println("The number of rows must be an odd number!");
			System.out.println("Please type in a size which is an odd number followed by enter");
			size  = input.nextInt();
		}
		//Prompting the user to enter the char he wants for the pattern
		System.out.println("Please enter the char you wish followed by enter key.");
		char pattern = input.next().charAt(0);
		//starting For sequence for the printing of the X 
		System.out.println("---- Printing X Pattern of Stars ------");
		for(int i = 0; i < size; i++) {
			for(int j =0; j<size;j++) {
				//the conditions for an char to appear on an X pattern
				if(i==j ||  j+i == size-1) {
					System.out.print(pattern);
				}
				System.out.print(" ");
			}
			//starting new line
			System.out.print("\n");
		}			
	}




}
