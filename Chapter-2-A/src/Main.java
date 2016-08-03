
public class Main {
	public static void main(String[] args) {
		Dice d = new Dice();
		
		for(int i=0; i<5; i++) {
			d.roll();
			d.show();
		}
	}
}
