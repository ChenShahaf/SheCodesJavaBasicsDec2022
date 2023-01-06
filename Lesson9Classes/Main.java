package Lesson9Classes;



public class Main {

	public static void main(String[] args) {
		Lion myLion = new Lion();
		
		//Lecture 9 - Slide 4
		myLion.height = 120;
		int h = myLion.height;
		/*
		 * Lecture 9 - Slide 5 - create all the fields for myLion
		 * 
		 * the fields(Attributes) for a Lion are:
		 * int height;
		   int weight;
		   String colour;
		   double roarDecible;
	       int maneLength;
		 * 
		 */
		 myLion.weight = 500;
		 myLion.colour = "Brown";
		 myLion.roarDecible = 95.0;
		 myLion.maneLength = 5;
		 /*
		  * Lecture 9 - Slide 5 - Print to the Screen all the attributes
		  * 					  you gave to your lion with a string beforehand
								 
								 Example:  Height: myLion.height
		  */
		   System.out.println("Height: " + myLion.height);
		   System.out.println("Weight: " + myLion.weight);
		   System.out.println("Colour: " + myLion.colour);
		   System.out.println("Roar Decible: " + myLion.roarDecible);
		   System.out.println("Mane Length: " + myLion.maneLength);
		   
		   //Lecture 9 - Slide 5 - Create a new Lion object call it how u wish
		   //						and fill its values
		   
		   Lion simba = new Lion();
		   simba.height = 150;
		   simba.weight= 450;
		   simba.colour = "Yellow";
		   simba.roarDecible= 75.12;
	       simba.maneLength= 10;
	       
	       //Lecture 9 -Slide 6 - Call the roar function on one of the lions u ceated
	       simba.roar();
	       /*
	        * Lecture 9 -Slide 6 - Call the Hunt method on one of the lions u created 
	        * 						save the returned value from the hunt method in a variable
	        * 						and print it to the screen
	        */
	       String returnValue = simba.hunt();
	       System.out.println(returnValue);
	       /*
	        * Lecture 9 Slide 7 - Create a method in the Lion Class called Lion color 
	        * 					   which prints out the attribute colour for both the lion 
	        * 						to the screen
	        */
	       myLion.printColour();
	       simba.printColour();
	       /*
	   	 * Lecture 9- Slide 9 - Create a method that receives a new height parameter 
	   	 * 						to the lion field and update it
	   	 * 						Check the method in the Main class
	   	 * 						via - check the height before and after the change 
	   	 */
	       System.out.println(myLion.height);
	       myLion.setHeight(160);
	       System.out.println(myLion.height);
	       
	       /*
	        * Lecture 9 - Slide 15
	        *
	        */
	       //Child child1 = new Child();
	       //Parent parent1 = new Parent();
	       //child1.name = "Noam";
	       //child1.parent = parent1;
	       /*
	   	 * Lecture 9 - Slide 15 - Can a Class contain an instance member of the 
	   	 * 				same type of itself? try to create inside the Lion class 
	   	 * 				a Lion instance and give it a value of an instance of another lion
	   	 * 
	   	 */
	       Lion lion3 = new Lion();
	       lion3.lion = myLion;
	       /*
	        * Lectrue 9 - Slide 16 - try to make a field in Lion class which is an int array and inialize in
	        * 
	        */
	       //myLion.setLionIntArray();
	       //myLion.printLionIntArray();
	       //Lecture 9 - Slide 18 - Call function to String on a lion and prints it values to the screen 
	       System.out.println("Lion 3 Parameters: " + lion3.toString());
	       
	       /*Lecture 9 Slide 22- 1.Create a player instance give it a name and points
	        * 					 2. print out the discrpition of the player 
	        * 					 3. add points to the player and check the added points method
	        * 					 4. print the player toString method again after adding points to the player
	        */
	       Player player1 = new Player();
	       player1.setName("Chen");
	       player1.setPoints(20);
	       System.out.println(player1.toString());
	       player1.setAddPoint(100);
	       player1.printAddedPoints();
	       System.out.println(player1.toString());
	       
	       



	}

}
