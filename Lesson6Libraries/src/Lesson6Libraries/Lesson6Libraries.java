package Lesson6Libraries;

import java.util.Scanner;
import java.util.Random;

public class Lesson6Libraries {

	public static void main(String[] args) {
		String longerStr = lonestString("She", "Codes");
		pasteString("hello", "world");
		int testNum = highestNum();
		nonZeroPrint();
		printStars();
		Examples();
		boolean quiz = guessNumber(5);
		
		 String testResult = replaceStartWithEndInString("Hello" , 3); 

	}
	/*Excersise 1 - write a function that receives 2 Strings and 
	*				and return the longest of the two
	*/
	public static String lonestString(String str1, String str2) {
		System.out.println("-------------EX1 Longest String----------------");
		System.out.println("First String: " + str1 + " Second String: " + str2);
		int lenStr1 = str1.length();
		int lenStr2 = str2.length();
		String longestStr = "";
		if(lenStr1  > lenStr2) {
			longestStr = str1;
		}
		if(lenStr2> lenStr1) {
			longestStr = str2;
		}
		if(lenStr2 == lenStr1) {
			longestStr = str1;
		}
		System.out.println("The longest string is " + longestStr);
		System.out.println("-------------End EX1---------------------------");
		return longestStr;
	}
	/*
	 * Excerise 2  - write a function that receives 2 equal length strings
	 * 				and return a string that plants the second string in the middle
	 * 				of the first string 
	 * 
	 * 	Example - input("hello", "world")
	 * 			  output("he world llo")
	 * 
	 */
	public static String pasteString(String str1, String str2) {
		System.out.println("-------------EX2 Paste String----------------");
		String result = "";
		//Manipulating the First String
		StringBuilder StrAFirstHalf = new StringBuilder();
		for(int i=0; i<str1.length()/2; i++) {
			StrAFirstHalf.append(str1.charAt(i));
		}
		StringBuilder StrASecondtHalf = new StringBuilder();
		for(int i=str1.length()/2 ; i<str1.length(); i++) {
			StrASecondtHalf.append(str1.charAt(i));
		}
		//Concat all three Strings
		result = StrAFirstHalf.toString().concat(str2).concat(StrASecondtHalf.toString());
		System.out.println("First String: " + str1 + " Second Str: " + str2 +
							" Result String: " + result);
		System.out.println("-------------End EX2---------------------------");
		return result;		
	}
	/*
	 * Exercise 3 - write a function that receives 3 numbers and returns the highest
	 *
	 */
	public static int highestNum() {
		System.out.println("-------------EX3 Highest Num----------------");
		//Since JAVA need a return not in an if we will declare a new variable
		int higest = 0;
		//imported the scanner library at the top of the page
		//opening a new instance of a Scanner to receive 3 numbers from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first number followed by enter:");
		int num1 = input.nextInt();
		System.out.println("Please enter the second number followed by enter:");
		int num2 = input.nextInt();
		System.out.println("Please enter the third number followed by enter:");
		int num3 = input.nextInt();
		//checking for the higest number
		if(num1>num2 && num1> num3 && num2>num3) higest = num1;
		if(num2>num1 && num2>num3 && num1 > num3) higest = num2;
		if(num3>num1 && num3>num2 && num2>num1) higest = num3;
		
		System.out.println("The first number is: " + num1 + " The second number is: " +
							num2 + " The third number is: " + num3 + " The higest num is: " + 
							higest);
		System.out.println("-------------End EX3---------------------------");
		
		return higest;
	}
	/*
	 * Exercise 4 - write a program that receives numbers from user and prints them 
	 * 				to the screen AS LONG as they are not zero
	 * 
	 * 	Guidace - use a loop with each iteration gets a new number from the user 
	 * 			  as long as the number is a non-zero it will get printed if it a zero
	 * 			  the program will exit. use a boolean
	 */
	public static void nonZeroPrint() {
		System.out.println("-------------EX4 Print Non Zero----------------");
		//Creating a new scanner instance
		Scanner input = new Scanner(System.in);
		/*using a boolean as a stop condition to the loop
	     as long as isZero is false (meaning the input is a non zero the loop
		 will continue
		*/
		boolean isZero = false;
		int number;
		//Printing a message to the user explaning how the program works
		System.out.println("You can enter numbers, if you wish to stop enter the number 0");
		while(!isZero) {
			System.out.println("Please enter a number followed by the enter key");
			number = input.nextInt();
			if(number == 0) {
				isZero = true;
			}
			else {
				System.out.println("The number is: " + number);
			}
		}
		System.out.println("-------------End EX4---------------------------");
	}
	/*
	 * Exercise 5 - Random Stars
	 * 				write a function that rolls up a dice and print out the number
	 * 				of the dice as stars to the screen
	 * 
	 * Example - if the dice randomly get 5 we will print 5 stars *****
	 */
	public static void printStars() {
		System.out.println("-------------EX5 dice print stars ----------------");
		//importing the random library at the top of the page
		// java.util.Random
		
		//Creating a new instance of Random to generate random numbers
		Random rand = new Random();
		//creating our dice, we added 1 since nextInt() will range from zero to num-1
		int dice = rand.nextInt(6)+1;
		System.out.println("The dice is: " + dice);
		//Looping until the number of the dice to print stars
		for(int i =0; i<dice; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("-------------End EX5---------------------------");
	}
	/*
	 * Exercise 6 - Examples
	 */
	public static void Examples() {
		System.out.println("-------------Examples----------------------------");
		//Example 1 - Use the correct method to find the highest value of x and y.
		int x = 5;
		int y = 10;
		Math.max(x, y);
		System.out.println("The max between "+ x + " and " + y + " is: " + Math.max(x, y));
		
		//Example 2 - Use the correct method to find the square root of x.
		x = 16;
		System.out.println("The square root of " + x + " is: " + Math.sqrt(x));
		//Example 3 - Use the correct method to return a 
		//            random number between 0 (inclusive), and 1 (exclusive).
		System.out.println("The function in Math library that return a value"
				+ " between 0 to 1 is random: " + Math.random());
		System.out.println("-------------End EXamples---------------------------");
	}
	/*
	 * QUIZ - Implement the function ‘guessNumber(int number)’.
			  The function gets positive integer number between 1 and 10.
			  The function returns a Boolean value – true or false.
			  The function needs to execute the following:

		
		1.Generate random number:

		You need to use Java Math to generate a random number between 1 and 10.

		2.Check if the input number is the same as the generated random number.

		3.Print the result and return a value:

		In case the generated random number is the same as the given input number, 
	    you need to print to the screen: GREAT JOB!!!
		And return true.

		Else you need to return false.


		For example:
 			guessNumber(7)            “”
 			guessNumber(7)          “GREAT JOB!!!”
	 */
	public static boolean guessNumber(int number) {
		System.out.println("-------------Lesson 6 Quiz question 1----------------");
		//Creating the result boolean
		boolean result = false;
		//STEP 1 - Generating a random number
		//Creating a random instance
		Random rand = new Random();
		//randNum is a random number between 1-10
		int randNum = rand.nextInt(10) + 1;
		//STEP 2 - check if the random number is the same as the input
		if(randNum == number) {
			System.out.println("The random number is: " + randNum + 
								" the input number is: " + number);	
			System.out.println("GREAT JOB!!!");
			result = true;		
		}
		else {
			System.out.println("The random number is: " + randNum + 
					" the input number is: " + number);	
			result = false;
		}
		System.out.println("-------------End Quiz question 1---------------------------");
		return result;
	}
	/*
	 * implement the function ‘replaceStartWithEndInString(String str, int num)’.
	   The function gets a string and a number as an input, 
	   it checks if the given string length is larger than the number, 
	   replace the character in the last index with the char in the first index.
	   
		For example:
		replaceStartWithEndInString(“JavaExample”, 3)            “eavaExamplJ”
		replaceStartWithEndInString(“JavaExample”, 15)          “JavaExample”
	 */
	public static String replaceStartWithEndInString(String str, int num) {
		System.out.println("-------------Lesson 6 Quiz question 2----------------");
		//Declaring variables
		StringBuilder result = new StringBuilder();		
		//Checking the length of the input String vs. the num
		if(str.length() > num) {
			char firstCharStr = str.charAt(0);
			char lastCharStr = str.charAt(str.length()-1);
			result.append(lastCharStr).append(str.substring(1,str.length()-1)).append(firstCharStr).toString();
		}
		if(str.length() == num) {
			result.append(str.toString());
		}
		if(num > str.length()) {
			result.append(str).toString();	
		}
		System.out.println("The String is: " + str + " The length of the String is: " + str.length() + " The number is: " + num);
		System.out.println("The result String is: " + result.toString());
		System.out.println("-------------End Quiz question 2---------------------------");
		return result.toString();
	}

}
