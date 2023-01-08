package Lesson10Classes;

/*
 * Lecture 10 - Slide 12 - Youtube Demonstration constructor
 */

//LET'S REMEMBER CLASSES NAMES SHALL BEGIN IN UPPER CASES 
public class Dog {
	
	String name;
	String breed;
	
	
	//Creating the Constructors
	Dog(String n, String b){
		name = n;
		breed = b;
		
	}
	
	Dog(){
		
	}
	
	
	public void bark() {
		System.out.println("Woof ");
	}
	
	public void dig() {
		System.out.println("Wah ");
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + "]";
	}
	

}
