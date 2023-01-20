package Lesson10Classes;

import java.text.DecimalFormat;
import java.util.*;

public class NumbersToText {
	/*
	 * Exercise 4 - write a program that takes a number and convert it to text
	 */
	private static final String[] tensNames = {
			"",
			" ten",
			" twenty",
			" thirty",
			" forty",
			" fifty",
			" sixty",
			" seventy",
			" eighty",
			" ninety"
	};

	private static final String[] numNames = {
			"",
			" one",
			" two",
			" three",
			" four",
			" five",
			" six",
			" seven",
			" eight",
			" nine",
			" ten",
			" eleven",
			" twelve",
			" thirteen",
			" fourteen",
			" fifteen",
			" sixteen",
			" seventeen",
			" eighteen",
			" nineteen"
	};
	
	public static int receiveNum() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = input.nextInt();
		return num;
	}
	
	public static boolean validNumOfDigits(int num) {
		boolean validNumOfDigits = false;
		int numLength = (int) (Math.log10(num) + 1);
		if(numLength <= 10 || numLength >= 0) {
			validNumOfDigits = true;
		}
		else {
			validNumOfDigits = false;
		}
		return validNumOfDigits;
	}
	public static int checkIfZero(int num) {
		if(num == 0) {
			System.out.println("The number: " + num + " is Zero");
		}
		return num;
	}
	public static int checkNegative(int num) {
		while(num < 0) {
			System.out.println("You have chosen a negative nummber choose a positive number");
			num = receiveNum();
		}
		return  num;
		
	}
	
	public static int validNum(int num) {
		boolean valid = false;
		int validNumber = num;
		valid  = validNumOfDigits(num);
		while(valid  == false) {
			validNumber = receiveNum();
			validNumOfDigits(validNumber);
			validNumber = checkNegative(num);
			validNumber = checkIfZero(validNumber);	
		}
		if(valid == true) {
			num = checkNegative(num);
			num = checkIfZero(validNumber);	
			System.out.print("Number is: " + num);
		}
		return validNumber;
	}
	
	public static void startProgramm() {
		int number = receiveNum();
		boolean validNum = false;	
		number = validNum(number); 
		String result = "";
		int numLength = (int) (Math.log10(number) + 1);
		if(numLength <=4) {
			result = convertLessThanOneThousand(number);
			System.out.println(result);
		}
		else{
			result = convert(number);
			System.out.println(result);
			
		}
	}


	private static String convertLessThanOneThousand(int number) {
		String soFar;

		if (number % 100 < 20){
			soFar = numNames[number % 100];
			number /= 100;
		}
		else {
			soFar = numNames[number % 10];
			number /= 10;

			soFar = tensNames[number % 10] + soFar;
			number /= 10;
		}
		if (number == 0) return soFar;
		return numNames[number] + " hundred" + soFar;
	}


	public static String convert(long number) {
		// 0 to 999 999 999 999
		if (number == 0) { return "zero"; }

		String snumber = Long.toString(number);

		// pad with "0"
		String mask = "000000000000";
		DecimalFormat df = new DecimalFormat(mask);
		snumber = df.format(number);

		// XXXnnnnnnnnn
		int billions = Integer.parseInt(snumber.substring(0,3));
		// nnnXXXnnnnnn
		int millions  = Integer.parseInt(snumber.substring(3,6));
		// nnnnnnXXXnnn
		int hundredThousands = Integer.parseInt(snumber.substring(6,9));
		// nnnnnnnnnXXX
		int thousands = Integer.parseInt(snumber.substring(9,12));

		String tradBillions;
		switch (billions) {
		case 0:
			tradBillions = "";
			break;
		case 1 :
			tradBillions = convertLessThanOneThousand(billions)
			+ " billion ";
			break;
		default :
			tradBillions = convertLessThanOneThousand(billions)
			+ " billion ";
		}
		String result =  tradBillions;

		String tradMillions;
		switch (millions) {
		case 0:
			tradMillions = "";
			break;
		case 1 :
			tradMillions = convertLessThanOneThousand(millions)
			+ " million ";
			break;
		default :
			tradMillions = convertLessThanOneThousand(millions)
			+ " million ";
		}
		result =  result + tradMillions;

		String tradHundredThousands;
		switch (hundredThousands) {
		case 0:
			tradHundredThousands = "";
			break;
		case 1 :
			tradHundredThousands = "one thousand ";
			break;
		default :
			tradHundredThousands = convertLessThanOneThousand(hundredThousands)
			+ " thousand ";
		}
		result =  result + tradHundredThousands;

		String tradThousand;
		tradThousand = convertLessThanOneThousand(thousands);
		result =  result + tradThousand;

		// remove extra spaces!
		return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
	}


}
