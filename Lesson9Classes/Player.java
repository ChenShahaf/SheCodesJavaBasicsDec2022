package Lesson9Classes;

/*
 * Lecture 9 Slide 21 - Create a to String to the player class created on lecture 8 
 */
public class Player {
	String name;
	int points;
	
	public int getPoint() {
		return points;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param points the points to set
	 */
	public void setPoints(int points) {
		this.points = points;
	}

	//Lecture 9 Slide 21 - Create a to String to the player class created on lecture 8 
	@Override
	public String toString() {
		return "Player [name=" + name + ", points=" + points + "]";
	}
	
	
	/*
	 * Lecture 9 Slide 21 - write a method to add points to a player (input point at current round,
																	output current point+ added points
	*/
	public int setAddPoint(int addPoints) {
		points = points + addPoints;
		return points;
	}
	public void printAddedPoints() {
		System.out.println("Current points after added points is: " + points);
	}
	

}
