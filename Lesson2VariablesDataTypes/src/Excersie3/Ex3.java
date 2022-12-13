/**
 * 
 */
package Excersie3;

/**
 * @author chen
 *
 */
public class Ex3 {

	/**
	 * Create all of the primitives (except long and double) with different values. 
	 * Concatenate them into a string and print it to the screen so it will print: H3110 w0r1d 2.0 true
	 */
	public static void main(String[] args) {
		
		//STEP 1 - CREATE ALL THE PRIMITIVES
		char H = 'H';
		int hello = 3110;
		char W = 'w';
		int O = 0;
		char R = 'r';
		int l = 1;
		char D = 'd';
		float two = 2.0f;
		boolean value = true;
		
		//STEP 2 - CONVERT ALL THE NON STRING PRIMITIVES TO STRINGS USING CASTING
		/*Since we are asked to "Concatenate them into a string" we need to convert all the Int's and Float's to Strings
		 * So we will use the String Class valueOf() method to cast
		 */
		
		String hString = String.valueOf(H);
		String helloString = String.valueOf(hello);
		String wString = String.valueOf(W);
		String Ostring = String.valueOf(O);
		String rString = String.valueOf(R);
		String lString = String.valueOf(l);
		String dString = String.valueOf(D);
		String twoString = String.valueOf(two);
		String valueString = String.valueOf(value);
		
		
		
		//STEP 3 USING CONCAT METHOD TO CREATE THE PHRASE "H3110 w0r1d 2.0 true"
		
		String HelloWorld2 = H + helloString + " " +  wString + Ostring + rString + lString + dString + " " + twoString + " "
				+ valueString;
		
		//STEP 3 PRINT 
		System.out.println(HelloWorld2);
		
		

	}

}
