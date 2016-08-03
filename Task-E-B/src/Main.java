import java.util.ArrayList;

public class Main {
	
	public static ArrayList<Paloma> createList() {
		// Custom method here
		return new ArrayList<Paloma>();
	}
	
	/*
	 * Don't edit any code below this line
	 */
	
	public static void main(String[] args) {
		ArrayList<Paloma> list = createList();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) instanceof Joom) {
				((Joom) list.get(i)).say();
			} else if(list.get(i) instanceof Kadodnam) {
				((Kadodnam) list.get(i)).say();
			} else {
				list.get(i).say();
			}
		}
	}
}
