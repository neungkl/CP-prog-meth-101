
public class Dice {

	int faceNumber;
	int[] faceAvailable = {1,2,3,4,5,6};
	
	Dice() { faceNumber = 1; }
	
	void roll() {
		int randomIndex = (int) (Math.random() * faceAvailable.length);
		faceNumber = faceAvailable[randomIndex];
	}
	
	void show() {
		System.out.println(faceNumber);
	}
}
