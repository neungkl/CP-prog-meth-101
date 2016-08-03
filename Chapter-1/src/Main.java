import java.util.ArrayList;

public class Main {
	
	int findMaxValue(int[] data) {
		int m = -1;
		
		for(int i=0; i<data.length; i++) {
			if(data[i] > m) m = data[i];
		}
		return m;
	}
	
	ArrayList<Integer> cleanOdd(ArrayList<Integer> data) {
		ArrayList<Integer> cl = new ArrayList<Integer>();
		for(int i=0; i<data.size(); i++) {
			if(data.get(i) % 2 == 0) cl.add(data.get(i));
		}
		return cl;
	}
	
	int goneNumber(int[] data) {
		int check = 0;
		
		for(int i=0; i<data.length; i++) {
			if(check != data[i]) return check;
			check++;
		}
		
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
