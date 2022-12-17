package Lesson5Functions;

import java.util.Scanner;

public class RunningLiquerStoreExample {

	

	public static void main(String[] args) {
		
		
		
		//boolean isMinor =  isMinor(userID.age);
		//System.out.println(isMinor);
		

	}
	
	//1. Create a function that type  name to the screen 
	public static void printNameToScreen(String input) {
		System.out.println("Hi your name is " + input);
	}
	
	//1.1 create a function that type the age of the user to the screen
	public static void printAgeToScreen(int input) {
		System.out.println("Hi your age is " + input);
	}
	
	//2. Create a function that recieves data from user
	//   the function will return the data it received from the user
	public static int getFromUserAge() {
		//Opening a new Scanner Object to receive Age from User
		Scanner input = new Scanner(System.in);
		//prompting thte user to enter age
		System.out.println("Please enter your age followed by enter");
		int age = input.nextInt();
		
		//Retruning the age
		return age;
	}
	
	//2.1. Create a function that recieves data from user
	//   the function will return the data it received from the user
	public static String getFromUserName() {
		//Opening a new Scanner Object to receive Age from User
		Scanner input = new Scanner(System.in);
		//prompting thte user to enter age
		System.out.println("Please enter your name followed by enter");
		String name = input.nextLine();

		//Retruning the age
		return name;
	}
	
	//  QA VALIDATING THAT THE STRING ENTERED DOESNT CONTAIN SPECIAL NOTES OR NUMBERS
	public static boolean isStringLetters(String inputStr) {
		//Declaring boolean value to return 
		boolean onlyLetterStr = false;
		
		//Declaring the length of the input String
		int len = inputStr.length();
		//Checking if the String is empty
		if(inputStr == null) {
			onlyLetterStr = false;
			System.out.println("The name is empty");
		}
		//Checking if String contain only letters char by char using a loop
		 for (int i = 0; i < len; i++) {
	         // checks whether the character is not a letter
			 // if it is not a letter ,it will return false
			 if ((Character.isLetter(inputStr.charAt(i)) == false)) {
				 onlyLetterStr = false;
				 System.out.println("The name contain special chars or numbers");
			 }
			 else onlyLetterStr = true;
		 }
		 return onlyLetterStr;
	}
	
	//3. Write a function to check if the user is a minor
	public static boolean isMinor(int inputAge) {
		boolean drinkingAge;
		boolean validAge;
		validAge = validAge(inputAge);
		
		while(validAge == false) {
			System.out.println("Age must be in range of 0-120");
			inputAge = getFromUserAge();
			validAge = validAge(inputAge);
		}
		//Meaning if we got here, the drinking age in valid range
		
		//Remember isMinor == false meaning the person in correct drinking age
		//         isMinor == true meaning the person is a Minor and can't drink
		if(inputAge < 18) {
			drinkingAge = true;
		}
		else drinkingAge = false;

		//Returning statement
		return drinkingAge;
	}

	// QA - FUNCTION VALIDTAING THAT AGE ENTERED FROM USER IS IN RANGE 0-120 
	public static boolean validAge(int testInputAge) {
		boolean validAge=false;
		if(testInputAge < 0 || testInputAge > 120) {
			System.out.println("Age can be between 0-120 please retype your age");
		}
		if(testInputAge > 0 && testInputAge < 120) {
			validAge = true;
		}
		//Returning validation test result
		return validAge;
	}
	
	//4. Write a function that create user ID (name +  age for each person)
	RunningLiquerStoreExample(String nameID, int ageID){	
		
		//Checking valid input - String is only Letters 
		//Step 1 - Declaring a boolean for valid String
		boolean validStr = isStringLetters(nameID);
		//Step 2 - Declaring a boolean for valid age
		boolean isAgeValid = validAge(ageID);
		
		//Giving the user chances to enter a name until the data is valid
		while(validStr == false) {
			nameID = getFromUserName();
			validStr = isStringLetters(nameID);
		}
		//Giving the user chances to enter a valid age
		while(isAgeValid == false) {
			ageID = getFromUserAge();
			isAgeValid = validAge(ageID);
			
		}
		printNameToScreen(nameID);
		printAgeToScreen(ageID);
	}
	
	//5. write a function that return a boolean value, that checks if payment was 
	//  successful. (the function return true meaning collection was successful)
	public static boolean getPay(){
		//Creating an object 
		RunningLiquerStoreExample userID = new RunningLiquerStoreExample(getFromUserName(),getFromUserAge());
		//Deckaring the return value
		boolean isValidPayment = false;
		//Checking if payment was ok
		if(isValidPayment) {
			//doPayment is a function not made - meant to collect the payment
			//doPayment(userID);
			isValidPayment = true;
		}
		
		return isValidPayment;		
	}

}
