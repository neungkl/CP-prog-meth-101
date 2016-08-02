import java.util.ArrayList;

/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Don't cheating LOL
 * Back to your code NOWWW
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */


public class TestCaseChecker {
	
	private int ma;
	private ArrayList<Integer> mb;
	private int mc;
	
	public int rand(int max) {
		return (int) (Math.random() * max);
	}
	
	public int[] A() {
		int max = rand(1000000);
		
		int[] a = new int[500];
		for(int i=0; i<500; i++) {
			a[i] = rand(max);
		}
		
		a[rand(500)] = max;
		ma = max;
		
		return a;
	}
	
	public ArrayList<Integer> B() {
		ArrayList<Integer> b = new ArrayList<Integer>();
		mb = new ArrayList<Integer>();
		
		for(int i=0; i<1000; i++) {
			int m = rand(1000000);
			
			if(m%2 == 0) mb.add(m);
			b.add(m);
		}
		
		return mb;
	}
	
	public int[] C() {
		mc = rand(10000);
		
		int[] c = new int[9999];
		for(int i=0,j=0; i<9999; i++,j++) {
			if(j == mc) j++;
			c[i] = j;
		}
		
		return c;
	}
	
	public void check(int AA, ArrayList<Integer> BB, int CC) {
		String[] name = {"Cat", "Dog", "Dolphin", "Banana", "Orange"};
		
		for(int i=0; i<100; i++) {
			int ia = rand(name.length);
			int ib = rand(name.length);
			String tmp = name[ia];
			name[ia] = name[ib];
			name[ib] = tmp;
		}
		
		System.out.println(ma == AA ? name[0] : name[1]);
		
		boolean correctB = true;
		for(int i=0; i<BB.size() && i<mb.size(); i++) {
			if(BB.get(i) != mb.get(i)) {
				correctB = false;
				break;
			}
		}
		System.out.println(correctB && BB.size() == mb.size() ? name[0] : name[2]);
		System.out.println(mc == CC ? name[0] : name[3]);
	}
}
