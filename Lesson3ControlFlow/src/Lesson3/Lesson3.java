package Lesson3;

import java.util.Scanner;

public class Lesson3 {

	public static void main(String[] args) {
		
		 Exercise1();
		 ageInFiveYears();
		 howOldAreYou();
	
	}
	
	public static void Exercise1() {

		/*
		 * Exercise 1 - Change the variables in the first section, so that each if statement resolves as true.
		 *
			String a = new String("Wow");
        	String b = "Wow";
        	String c = a;
        	String d = c;

        	boolean b1 = a == b;
        	boolean b2 = d.equals(b + "!");
        	boolean b3 = !c.equals(a);

        	if (b1 && b2 && b3) {
            	System.out.println("Success!");
        	}
		 */
		//Removed the Object and made a to variable
		String a = "Wow";
		//b is the same as is was in the begning and now equals a
    	String b = a;
    	//in order so c wont be equal to a we made c equals "Wow!"
    	String c = b + "!";
    	//In order for d to be equal to b+ "!" we need to keep d = c
    	String d = c;

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }	
	}
	public static void ageInFiveYears() {
    	/*
    	 * 1. Ask the user for their name. 
    	 * 2. Then display their name to prove that you can recall it. 
    	 * 3. Ask them for their age. 
    	 * 4. Then display what their age would be five years from now. 
    	 * 5. Then display what their age would be five years ago.
    	 */
		
		//We need to use Scanner Object for this Excerise - 
		//we imported the scanner library in the top of the page
		
		//Step 1 Creating a new Scanner object to get input from the user
		Scanner input = new Scanner(System.in);
		//Print a message to the screen to the user to recieve his inputs
		System.out.println("Hi please type in your name followed by enter: ");
		//we creating a variable name to receive the input using the scanner object
		String name  = input.nextLine();
		//Step 2 - Display the name we receievd as an input
		System.out.println("Hi " + name);
		//Step 3 - asking for the user age
		System.out.println("Please type in your age followed by enter: ");
		int age = input.nextInt();
		//now we finished receive data we will close the scanner
		input.close();
		//Step 4 - displaying the user age 5 years from now
		System.out.println("Your age in 5 years will be: " + (age+5));
		//Step 5 - display the user age 5 years ago
		System.out.println("Your age 5 years ago was: " + (age-5));		
    }
	public static void howOldAreYou() {
		/*
		 * Make a program which displays a different message depending on the age given. Here are the possible responses:

			age is less than 16, say "You can't drive."
			age is less than 18, say "You can't vote."
			age is less than 25, say "You can't rent a car."
			age is 25 or over, say "You can do anything that's legal."
			
			Here's a sample run. 
			Notice that a person who is under 16 will display three messages
			one for being under 16, 
			one for also being under 18, 
			and one for also being under 25.
			
			Example:
			Hey, what's your name? Billy_Corgan
			Ok, Billy_Corgan, how old are you? 17
			You can't vote, Billy_Corgan.
			You can't rent a car, Billy_Corgan.
		 */
		//Step 1 we need to create a scanner object to receive the age and name of the user
		Scanner input = new Scanner(System.in);
		//assigning the name and age of the user
		System.out.println("Hi please type in your name followed by enter key: ");
		String name = input.nextLine();
		//Displaying the user name and procced to receive thier age
		System.out.println("Hi " + name + "Please type in your age followed by the enter key: ");
		int age = input.nextInt();
	
		
		/*
		 * Section Ex 4 - Validiation for age between 0-120
		 */
		while(age<=0 || age>=120) {
			System.out.println("Please note that age can't be below 0 or above 120");
			System.out.println("Please type your age again followed by the enter key");
			age = input.nextInt();
		}
		
		//after reaching this level, meaning that the age is correct we will close the scanner
		input.close();
		
		//Starting Control flow sequence 
		if(age < 16) {
			System.out.println("You can't drive");
		}
		if(age < 18) {
			System.out.println("You can't vote");
		}
		if(age < 25) {
			System.out.println("You can't rent a car");
		}
		if(age >= 25) {
			System.out.println("You can do anything that's legal.");
		}
	}

}
