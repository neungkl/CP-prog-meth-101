
public class Main {
	
	public static Car getCar2() {
		// You can custom Method here
		
		return new Car();
	}
	
	/*
	 * 
	 * Don't edit any code below this line
	 * 
	 */

	public static void main(String[] args) {
		Car car1 = new Car();
		for(int i=0; i<5; i++) {
			Box box = new Box();
			
			box.addPocky(new Pocky("Stawberry", Pocky.SMALL));
			box.addPocky(new Pocky("Chocolate", Pocky.LARGE));
			box.addPocky(new Pocky("Vanilla", Pocky.MEDIUM));
			
			car1.addPockyBox(box);
		}
		
		Car car2 = getCar2();
		
		test(car1, car2);
	} 
	
	public static void test(Car c1, Car c2) {
		System.out.println("CAR 1");
		System.out.println("=========================");
		System.out.println("getBoxQuantity : ");
		System.out.println(c1.getBoxQuantity() == 5 ? "OOO" : "XXX");
		for(int i=0; i<c1.getBoxQuantity(); i++) {
			Box b = c1.getPockyBoxAt(i);
			
			System.out.println("\ngetCapacity : ");
			if(b.getCapacity() == 3) System.out.println("OOO");
			else {
				System.out.println("XXX");
				continue;
			}
			
			
			String[] testCase = {
				"stawberry", "small",
				"chocolate", "large",
				"vanilla", "medium"
			};
			
			System.out.println("\nTaste & Size : ");
			for(int j=0; j<testCase.length; j+=2) {
				if(b.getPockyAt(j / 2).getTaste().toLowerCase().equals(testCase[j])) {
					System.out.println("OOO");
				} else {
					System.out.println("XXX");
				}
				if(b.getPockyAt(j / 2).getSize().toLowerCase().equals(testCase[j+1])) {
					System.out.println("OOO");
				} else {
					System.out.println("XXX");
				}
			}
		}
		
		System.out.println("\n\nCAR 2");
		System.out.println("=========================");
		System.out.println("getBoxQuantity : ");
		System.out.println(c2.getBoxQuantity() == 3 ? "OOO" : "XXX");
		for(int i=0; i<c2.getBoxQuantity(); i++) {
			Box b = c2.getPockyBoxAt(i);
			
			System.out.println("\ngetCapacity : ");
			if(b.getCapacity() == 5) System.out.println("OOO");
			else {
				System.out.println("XXX");
				continue;
			}
			
			
			String[] testCase = {
				"stawberry", "small",
				"chocolate", "large",
				"vanilla", "medium"
			};
			
			System.out.println("Taste & Size : ");
			for(int j=0; j<b.getCapacity(); j++) {
				if(b.getPockyAt(j).getTaste().toLowerCase().equals(testCase[i*2])) {
					System.out.println("OOO");
				} else {
					System.out.println("XXX");
				}
				if(b.getPockyAt(j).getSize().toLowerCase().equals(testCase[i*2+1])) {
					System.out.println("OOO");
				} else {
					System.out.println("XXX");
				}
			}
		}
	}
}
