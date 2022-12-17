package Lesson5Functions;

import java.util.Date;  
import java.util.Calendar;

public class Lesson5Functions {

	public static void main(String[] args) {
		//Calling the isPositive
		int number  = 6;
		boolean testPositive = isPositive(number);
		
		age("Chen", 2000);
		String test = combineStrings("She","Codes");

	}
	
	//Excersise IsPositive - write a function that receives a double
	//          return a true (boolean) if the number is positive false
	//          if the number is negative and print the outcome to the screen
	public static boolean isPositive(int number) {
		boolean isPositive = false;
		if(number > 0) {
			isPositive = true;
		}
		System.out.println("Excersise 1 - is the number positive?");
		//Printint the output to the screen
		System.out.println("the number " + number + " is positive? " + isPositive);
		System.out.println("--------------End Ex1------------------------------");
		return isPositive;
	}
	/*
	 * Excersise 2 - write a function that receives a name and a birth year
	 * 				the function will print out to the screen the input parameters 
	 * 				the function will print out the age of the user according to 
	 * 				its birthyear
	 */
	public static void age(String name, int birthYear) {
		System.out.println("Excersise 2 - What's your age?");
		//Printing the parameters received from user
		System.out.println("Hi " + name);
		System.out.println("Your birth year is " + birthYear);
		//In order to calculate the age of user we need to import java.util.Date;
		// we need to also import java.util.Calendar;
		//STEP 1  - we will create an instance of a current date from the computer
		Date currDate = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(currDate);
		//STEP 2 - we will use the getYear() from the library to extract the year
		int currYear = cal.get(Calendar.YEAR);
		//STEP 3 - calculating the age of the user from the data in hand
		int age = currYear - birthYear;
		System.out.println("Your name is " + name + "Your age is " + age);
		System.out.println("--------------End Ex2------------------------------");
		
		
	}
	/*
	 * QUIZ 3 - 
	 * 
	 * You are given a function ‘combineStrings’ that gets 2 strings - str1 and str2, and returns a new string which contains both given strings.

		For example, if the input is:

		Str1 = “She”

		Str2 = “Codes”

		The result should be:

		“SheCodes”
	 * 
	 * Copy the following lines 
	 * public static int combineStrings(String str1, String str2) {

           StringBuilder sb = new StringBuilder();

           sb.append(str1);

           sb.append(str2);

           return sb.toString();
      }
       Step b:

		you need to change something in the code, 
		so that the function will reproduce the requested result.

		Hint - If you press the ‘check’ button and try to run the code as 
		it is now, you will get the following error:

       error: incompatible types: String cannot be converted to int

		Step c:

	   when you have finished, 
	   click on the 'check' button to ensure that your code is correct.


	 */
	//We changed the Signature from int(return value) to String
	public static String combineStrings(String str1, String str2) {
		System.out.println("Quiz - Appending 2 Strings together");

        StringBuilder sb = new StringBuilder();

        sb.append(str1);

        sb.append(str2);
        
        String sheCodes = sb.toString();
        
        System.out.println(sheCodes);
        System.out.println("--------------End Quiz------------------------------");

        return sheCodes;
   }

}

