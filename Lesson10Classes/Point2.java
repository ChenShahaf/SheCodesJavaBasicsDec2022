package Lesson10Classes;

public class Point2 {
	int m_x, m_y; 
	
	public Point2(int x, int y) {
	    m_x = x;    
	    m_y = y;  
	}
	public Point2() { 
		this(10, 10); 
	}
	public int getX() {
		return m_x; 
	}
	public int getY() {
		return m_y; 
	}

}
