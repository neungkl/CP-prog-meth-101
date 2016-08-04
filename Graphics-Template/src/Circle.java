
public class Circle {
	private int x;
	
	public Circle() { x = 0; }
	public void update() { 
//		x += 5; 
//		if(x > 600) x = 0;
	}
	
	public void moveLeft() {
		x -= 10;
		if(x < 0) x = 600 - 100;
	}
	
	public void moveRight() {
		x += 10;
		if(x > 600) x = 0;
	}
	
	public int getX() {
		return x;
	}
}
