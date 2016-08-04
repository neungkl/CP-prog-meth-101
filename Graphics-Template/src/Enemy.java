
public class Enemy {
	
	private int x;
	private int y;
	
	public Enemy() { 
		x = (int) (Math.random() * 600); 
		y = 0;
	}
	
	public void update() {
		y += 5;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
