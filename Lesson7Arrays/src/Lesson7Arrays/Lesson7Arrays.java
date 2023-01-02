package Lesson7Arrays;

import java.util.*;  

public class Lesson7Arrays {

	public static void main(String[] args) {
		
		exerciseOne();

	}
	public static void printArray() {
		/*
		 * Slide 13 Lecture 7 Arrays - 
		 * 		
		 * Write a program that has an array with 20 elements in the array
		 * that will print the array to the screen using only one print statement
		 * 
		 */
		//STEP 1 - LETS CREATE AN ARRAY WITH 20 ELEMENTS
		int[] array = new int[20];
		
		for(int i=0; i<20; i++) {
			array[i] = i;
		}
		
		//STEP 2 - WE WILL TYPE THE ARRAY USING A LOOP
		for(int i=0; i< array.length;i++) {
			System.out.print(array[i] + " ");
		}
	}
	//Change the values in numbers so it will not raise an error.
	public static void exerciseOne() {
		System.out.println("---------------Ex 1-------------------------------");
		//we need to add one more value to numbers so there won't be an error
		int[] numbers = {1, 2, 3};
        //int length = numbers[3]; index 3 is out of bound so we will change it to index 2
		int length = numbers[2];
        char[] chars = new char[length];
      //char[] chars = new char[length + 4]; length is out of boud we will change it to length-1
        chars[numbers.length-2] = 'y';
        System.out.println("Done!");
        System.out.println("--------------- End Ex 1-------------------------------");
	}
	public static void sumsInLoop() {
		System.out.println("---------------Ex 2-------------------------------");
		/*
		 * Now our goal is to learn the loops - 
		 * i.e. repeated actions. Let us find the sum of several numbers 
		 * (more than two). It will be useful to do this in a loop. 
		 * As shown in the picture above - you can create variable sum 
		 * and add every value from the list to it. 
		 * Perhaps "for" loop will suit nicely since the amount of numbers is known 
		 * beforehand.
		 * 
		 * 
		 * first line contains N - amount of values to sum;
			second line contains N values themselves.
			Answer should contain a single value - the sum of N values.
		   
		 */
		int [] numbers  = {988, 1071, 975, 360, 1272, 439 ,913, 504, 146, 425, 1119,
							1214, 211, 858, 173, 858, 713 ,371, 262, 1091, 1032, 1107,
							80 ,162, 1128, 910, 553, 323, 563, 823, 514 ,616, 161, 677,
							66 ,793, 98, 466, 474, 1256, 1206 ,1145};
		int sum = numbers[0];
		
		for(int i=1; i< numbers.length;i++) {
			System.out.println(numbers[i]);
			System.out.println(sum);
			sum += numbers[i];
		}
		
		System.out.println(sum);
		System.out.println("---------------End Ex 2-------------------------------");
	}
	public static void minOfTwo() {
		System.out.println("---------------Ex 3-------------------------------");
		/*
		 * Input data will contain number of test-cases in the first line.
		   Following lines will contain a pair of numbers to compare each.
		   For Answer please enter the same amount of minimums separated by space, 
		   
		   for example:
		   data:
			3
			5 3
			2 8
			100 15

			answer:
			3 2 15
		 */
		int [] colA = {4873491, 9912396, -4976289, 5608763, -9979224 , 3543281, 
						5503867, 2638004, 2717338 ,-2894737 , 6313962, 2288671 , 
						5808607, 6884777 , -2683157 , 3610433, -7311095, -7274280,
						-3990297 ,9899447, 9344530};
		int [] colB = {-4804532, -6660511,-7447188, 7579891, 5016359, -4810171,
						5046422, -2083635, -2177281, 5295992, 8100331, 7672181,
						2009355, -2394946, -4704995, 6613154, 6330772, 9087015,
						8083365, -2293356, 4221988};
		
		ArrayList<Integer> result = new ArrayList<Integer>(); 
		
		for(int i=0; i < colA.length;i++) {
			
			result.add(Math.min(colA[i], colB[i]));
			//System.out.println("Array A: " + colA[i] + " Array B: " + colB[i]);
			
		}
		Arrays.asList(result);
		System.out.println("Array: "+Arrays.asList(result).toString());
		System.out.println("---------------End Ex 3-------------------------------");
	}
	public static void maxOfArray() {
		System.out.println("---------------Ex 4-------------------------------");
		/*
		 *  This problem introduces popular algorithm of the "linear search",
		 *  which should be learnt thoroughly as it is often used in programming more complex tasks (sorting etc.)
			Very common operation on sequence of values, or arrays 
			find its extremal value - maximum or minimum.
			
			
			HOW TO DO LINEAR SEARCH?
			
			1. store current maximum (or minimum respectively) in a separate variable, 
			2. run through array, comparing each of its elements to this variable. 
			3. Whenever next value is greater than this temporary variable, 
			   this value should be copied into it (as a new maximum).
			4. At the end of the pass this temporary variable will hold the extremum 
			  value.
			
			in this exercise the input data will give you exactly 300 numbers in a single line.
			Answer should contain maximum and minimum of these values,
			separated by space.
			
			Example:
			input data:
			1 3 5 7 9 11 ... 295 297 299 300 298 296 ... 12 10 8 6 4 2

			answer:
			300 1
		 */
		  //Input
		String inputAsString = "61290 -18224 34922 64054 -78538 -8633 -48815 "
								+ "68096 21983 71515 -16382 -78232 -32650 -42280 "
								+ "-26301 -18301 1223 -55914 77871 20543 17911 "
								+ "-4860 51455 -2465 -5354 45293 -67219 -61881 "
								+ "-17022 45235 19839 -9421 6624 -40011 5213 -5984 "
								+ "72775 24556 -49872 42955 44776 -43430 27643 "
								+ "-54697 50119 -67546 28773 -40946 -57389 48838 "
								+ "53731 -38451 -30100 -68414 -14901 -60669 26304 "
								+ "-47037 65468 33699 39918 -19425 11845 51576 "
								+ "63749 27321 -64499 76405 12591 65228 -3425 "
								+ "47656 56305 20235 39825 -537 3616 -33840 "
								+ "-70036 73618 -47647 -49091 63024 -77746 72277 "
								+ "-15092 8110 57899 -52829 71139 -29466 -15121 "
								+ "-11858 47470 -15951 12001 -71753 61802 7505 "
								+ "-19910 -52580 -62441 74303 -39737 -18422 "
								+ "-48951 -35427 49605 5332 33557 -27091 -16509 "
								+ "-55773 -41099 -41581 64501 -56589 -63335 "
								+ "-50921 -28138 67962 1576 45695 -34981 -58668 "
								+ "52951 24060 -29428 -73152 -55389 2475 78773 "
								+ "22519 -53015 -42886 32259 75544 16603 76860 "
								+ "48621 45441 74211 40105 9204 78981 -40224 43496 "
								+ "-15959 -44934 19475 18979 15585 2716 -77689 "
								+ "-20556 -68689 54333 75648 -38427 66699 -75894 "
								+ "79930 -23861 14363 -61346 5249 -21081 -68994 "
								+ "-13468 127 63911 3962 4011 11086 5871 -49200 "
								+ "28118 -46560 -65083 -116 79478 -39672 66259 "
								+ "-58827 71541 19994 -79847 -47399 19624 -58689 "
								+ "25706 -71403 61584 -10424 79823 -51114 -21256 "
								+ "-1160 77252 -62295 30603 -46440 -17514 -37481 "
								+ "-53832 47342 -40606 4062 -74384 41613 -49713 "
								+ "43563 50501 -59670 -57638 -71231 32339 13341 "
								+ "35207 -57283 9849 5243 -61750 -20622 23460 "
								+ "-12372 45505 -49904 -18761 64005 -21068 7674 "
								+ "66748 14405 -10968 -30988 -55707 -48140 14809 "
								+ "71568 -30505 33664 -19725 18625 -4424 36945 "
								+ "-75103 40595 -49383 38771 -58060 -56687 66139 "
								+ "-60606 -78571 66655 -56303 51529 10480 43437 "
								+ "-64544 22183 22723 -2845 31676 5958 56687 -62688 "
								+ "-71228 6535 47282 -21517 -53046 59120 44538 "
								+ "-1637 -59817 -4468 62266 -3277 -54699 9327 "
								+ "-26631 -54317 -71176 -24444 28642 -69865 75716 "
								+ "31061 -21124 16338 -48382 -41991 -68482 -14928 "
								+ "8188 41353 31020 -40178";
		
		/* Step 1 - we will have to go through the String input 
		 * and store each number sepearted by space into an array of Int's
		 *
		 *
		 * A. Converting the entire long string of numbers input to a String array
		 * 	  with all the numbers seprated into individial numbers as Strings
		 */
		String[] inputTemp = inputAsString.split(" ");
		/*B. Creating a new blank Integer array to store all the numbers from String
		* 	 to Int's, REMEMBER INT ARRAY IS IMMUTABLE IN SIZE!
		*/
		int [] inputAsInt = new int[inputTemp.length];
		/*
		 * C. 1. Looping through the String Array with the sepreated numbers
		 *    2. Convert each String number to an Int
		 *    3. Stroing each new Int to the blank integer array
		 * 		
		 */
		//Looping through the String array
		for(int i=0; i<inputTemp.length; i++) {
			//Converting each element from String to an Int - Integer.parseInt(inputTemp[i]
			// Storing the new int into the correct position in the int array - inputAsInt[i] = Integer.parseInt(inputTemp[i]
			inputAsInt[i] = Integer.parseInt(inputTemp[i]);
		}
		//Creating a local minimum and maximum to compare to each element in the array
		int min = 0;
		int max = 0;
		//looping through the array and comparing each element for the min and max
		for(int i = 0; i< inputAsInt.length; i++) {
			if(inputAsInt[i] > max) {
				max = inputAsInt[i];
			}
			if(min > inputAsInt[i]) {
				min = inputAsInt[i];
			}
		}
		System.out.println("Max: " + max + " Min: " + min);
		System.out.println("---------------End Ex 4-------------------------------");
	}
	/*
	 *  -------- Cyclic Rotation Excerise -----------
	 *  An array A consisting of N integers is given. 
		 * Rotation of the array means that each element is shifted right by one 
		 * index, and the last element of the array is moved to the first place. 
		 * 
		 * For example, 
		 * the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] 
		 * (elements are shifted right by one index 
		 * and 6 is moved to the first place).
		  The goal is to rotate array A K times; 
		  that is, each element of A will be shifted to the right K times.

		 Write a function:
		 class Solution { public int[] solution(int[] A, int K); }
		 that, given an array A consisting of N integers and an integer K, 
		 returns the array A rotated K times.
		 
		  --VALIDATION PART--
		 Assume that:

		 1. N and K are integers within the range [0..100];
		 2. each element of array A is an integer within the range [−1,000..1,000].
		 
		 In your solution, focus on correctness. 
		 The performance of your solution will not be the focus of the assessment.
		 

		 For example, given
    	 A = [3, 8, 9, 7, 6]
    	 K = 3
		 the function should return [9, 7, 6, 3, 8]. Three rotations were made:
    	 [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    	 [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    	 [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
		
		
		 For another example, given
    	 A = [0, 0, 0]
    	 K = 1
		 the function should return [0, 0, 0]

		 Given
    	 A = [1, 2, 3, 4]
    	 K = 4
		 the function should return [1, 2, 3, 4]
	 * 
	 */
	public static int[]  rotationNaiveSolution(int[] input, int K) {
		System.out.println("-------------------------EX5 Navie approce-------------------------------");
		/*
		 *  For example, given
    	 A = [3, 8, 9, 7, 6]
    	 K = 3
		 the function should return [9, 7, 6, 3, 8]. Three rotations were made:
    	 [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    	 [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    	 [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
		 */
		
		int[] temp = new int[input.length];
		
		//----------------------------------------VALIDATION FUNCTIONS--------------- 
		
		temp = checkIfKIsArrayLength(input, K);
		
		temp = checkIfArrayisZero(input, K);
		
		K = checkkInRange(K);
		
		temp = checkArrayNums(input);
		
		temp = checkingIfRotationIsNeeded(input, K);
		System.out.println("The original array is: ");
		printArray(input);
		//-------------------------------------------------------------------------
		
		for(int i=0; i<K; i++) {
			temp = rotateOnce(input);
			
		}
		System.out.println("The rotated array is: ");
		printArray(input);
		System.out.println("-------------------------END EX5 Navie approch-------------------------------");
		return temp;
	}
	
	public static int[] rotateModuloApproch(int[] array, int K) {
		System.out.println("-------------------------EX5 Modulo approce-------------------------------");
		int[] copy = new int[array.length];
		//-----------------VALIDATION FUNCTIONS-------------------------------

		array = checkIfKIsArrayLength(array, K);

		array = checkIfArrayisZero(array, K);

		K = checkkInRange(K);

		array = checkArrayNums(array);

		array = checkingIfRotationIsNeeded(array, K);
		System.out.println("Original array: ");
		printArray(array);
		//------------REVERSE---------------------------------------------------
		for(int i=0; i<array.length;i++) {
			copy[(i + K) % array.length] = array[i];
		}
		System.out.println("Reversed Array: ");
		printArray(copy);
		System.out.println("-------------------------END EX5 Modulo approch-------------------------------");
		return copy;
	}
	
	public static int[] rotationReverseSolution(int[]A, int K) {
		
		System.out.println("-------------------------EX5 Reverse approch-------------------------------");
		
		//-----------------VALIDATION FUNCTIONS-------------------------------
		//Creating an int[] copy to A to check A array for validation
		int[] validation = new int[A.length];
		for(int j = 0; j < A.length; j++) {
			validation[j] = A[j]; 
		}
		validation = checkIfKIsArrayLength(A, K);

		validation = checkIfArrayisZero(A, K);

		K = checkkInRange(K);

		validation = checkArrayNums(A);

		validation = checkingIfRotationIsNeeded(A, K);
		
		System.out.println("The original Array: ");
		printArray(A); 

		//Convert A int[] to Integer[] 
		Integer[] Ainteger = new Integer[A.length];

		for(int ctr = 0; ctr < A.length; ctr++) {
			Ainteger[ctr] = Integer.valueOf(A[ctr]); // returns Integer value
		}
	
		//Create a copy of the Ainteger to reverse it
		Integer[] reverse = new Integer [Ainteger.length];
		
		//STEP 3 REVERSE THE ENTIRE COPY
		reverse = reverse(Ainteger);
		
		//STEP 4 - SINCE K=3 WE NEED TO REVERSE BACK ONLY 6,7,9 AND 8,3 APART 
		//AS SEMI ARRAYS

		Integer[] reversePartA = Arrays.copyOfRange(Ainteger, 0, 3);
		//printArrayInteger(reversePartA);
		//Reversing the First Half of the Array
		reversePartA = reverse(reversePartA);
		//printArrayInteger(reversePartB);
		//Reversing the First Half of the Array
		Integer[] reversePartB = Arrays.copyOfRange(Ainteger, 3, reverse.length);
		reversePartB = reverse(reversePartB);
		//Bonding the two parts together
		Integer[] resultList = new Integer[reversePartA.length+reversePartB.length];
		System.arraycopy(reversePartA, 0, resultList, 0, reversePartA.length);  
		System.arraycopy(reversePartB, 0, resultList, reversePartA.length, reversePartB.length); 
		//Converting the result from Integers[] to int[]
		int[] integers = new int[resultList.length];

		for (int i = 0; i < resultList.length; i++) {
			integers[i] = resultList[i];
		}
		System.out.println("Reversed array: ");
		printArray(integers); 
		System.out.println("-------------------------END EX5 Reverse approch-------------------------------");
		return integers;
	}
	
	
	
	//--------------------------VALIDATION HELPER FUNCTIONS--------------------------
	public static int[] checkIfKIsArrayLength(int[]array, int K) {	
		if(K == array.length) {
			
			System.out.println("There is nothing to rotate");
		}
		return array;
	}
	
	public static int[] checkIfArrayisZero(int[] array, int K) {
		
		boolean nonZero = false;
		
		for(int i = 0 ; i< array.length; i++) {
			if(array[i] != 0) {
				nonZero = true;
			}
			
			else {
				nonZero = false;
			}
		}
		
		
		return array;
	}
	
	
	
	
	
	//---------------------------------------HELPER FUNCTIONS------------------------------
	public static int checkkInRange(int K) {
		//Creating new Scanner object to pick up new K 
		
		Scanner input = new Scanner(System.in);
		
		
		while(K> 1000 || K < 0) {
			System.out.println("K must be a number betweeb 0-1000");
			System.out.println("Pleast pick another K in range: ");
			K = input.nextInt();
			if(K<= 1000 && K >= 0) {
				break;
			}
		}
		
		return K;
	}
	
	public static int[] checkArrayNums(int[] array) {
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<array.length;i++) {
			int j=i;
			if(array[j] > 1000 || array[j] < -1000) {
				while(array[j] > 1000 || array[j] < -1000) {
					System.out.println("Element " + array[j] + " is out of range");
					System.out.println("The range of the elements of the array must be in -1000 to 1000);");
					array[j] = input.nextInt();
				}
			}
		}
		return array;
	}
	
	public static int[] checkingIfRotationIsNeeded(int[] arr, int K) {
		int numOfLengthArr = arr.length;
		
		if(K == numOfLengthArr) {
			System.out.println("Nothing to rotate");
		}
		
		if(K%numOfLengthArr == 0) {
			System.out.println("Nothing to rotate");
		}
		
		if(K == 0) {
			System.out.println("Nothing to rotate");
		}
		return arr;
	}
	//-----------------ROTATE ONCE AND PRINTING FUNCTIONS------------------------------
	
	public static Integer[] reverse(Integer[] array) {	

		Collections.reverse(Arrays.asList(array));

		Integer[] result   = new Integer [array.length];

		for(int ctr = 0; ctr < array.length; ctr++) {
			result[ctr] = Integer.valueOf(array[ctr]); // returns Integer value
		}

		return  result;
	}
	
	public static int[] rotateOnce(int[] input) {
		int last = input[input.length-1];
		for(int i=input.length-1;i>0;i--) {
			input[i] = input[i-1];
		}
		input[0] = last;
		return input;
	}
	public static void printArray(int[] arrayInput) {
		for(int i=0; i< arrayInput.length;i++) {
			System.out.print(arrayInput[i] + " ");
		}
		System.out.println();
	}

	public static void printArrayInteger(Integer[] arrayInput) {
		for(int i=0; i< arrayInput.length;i++) {
			System.out.print(arrayInput[i] + " ");
		}
		System.out.println();
	}
	/*
	 * Lecture 7 Arrays - Slide 19
	 * 
	 * How to Print a Two dimentional array as a table
	 */
	public static void print2DArray(int arr[][]) {
		for(int row = 0; row<arr.length; row++) {
			for(int col=0; col< arr[row].length;col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	/*
	 * Lecture 7 Arrays - Slide 20 
	 * 
	 * Write a program that create two dimentioanl array of Strings 
	 * with 2 Rows and 3 Cloumns fill the values as you wish 
	 * print to the screen the value in the Second Row- Third Column
	 */
	public static void twoDimentionArray() {
		System.out.println("-------------------------Lecture 7 Slide 20--------------------");
		String[][] arr = {{"Tom", "Jhon","Matthew"}, {"Paul", "Lennon","Andrey"}};
		
		//Defining the rows and columns
		int row = arr.length;
		int col = arr[0].length;
		//Printing the numbers of rows and colums
		System.out.println("Numbers of rows: " + row);
		System.out.println("Numbers of Columns: " + col);
		System.out.println("The Second Row Third Column element is :" + arr[1][2]);
	}
	
	
}

