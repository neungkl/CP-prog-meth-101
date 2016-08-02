import java.util.ArrayList;

public class Main {
	
	int findMaxValue(int[] data) {
		// Write code here
		return 0;
	}
	
	ArrayList<Integer> cleanOdd(ArrayList<Integer> data) {
		// Write code here
		return new ArrayList<Integer>();
	}
	
	int goneNumber(int[] data) {
		// Write code here
		return 0;
	}
	
	
	// Don't edit any code below here

	public static void main(String[] args) {
		TestCaseChecker testcase = new TestCaseChecker();
		Main main = new Main();
		testcase.check(
			main.findMaxValue(testcase.A()),
			main.cleanOdd(testcase.B()),
			main.goneNumber(testcase.C())
		);
	}

}
