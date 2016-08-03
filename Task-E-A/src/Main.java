
public class Main {
	
	public static int getTheWolf(Bunny[] bunnys) {
		return 0;
	}
	
	/*
	 * Don't edit any code below this line
	 */
	
	public static void main(String[] args) {
		Bunny[] bunnys = randomBunny();
		int idx = getTheWolf(bunnys);
		
		if(bunnys[idx] instanceof Wolf) {
			((Wolf) bunnys[idx]).say();
		} else {
			bunnys[idx].say();
		}
	}
	
	public static Bunny[] randomBunny() {
		Bunny[] bunnys = new Bunny[500];
		for(int i=0; i<500; i++) bunnys[i] = new Bunny();
		bunnys[(int) (Math.random() * 500)] = new Wolf();
		return bunnys;
	}
}
