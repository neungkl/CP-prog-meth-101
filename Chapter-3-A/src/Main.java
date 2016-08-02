
public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		String[] buyAnimalList = {
			"Tiger",
			"Tiger",
			"Bear",
			"Goat",
			"Shark",
			"Bear"
		};
		
		for(int i=0; i<20; i++) {
			zoo.setPeopleEnterToday(i + 5);
			zoo.calculateMoney();
			System.out.println("==== Day " + (i + 1) + " ====");
			System.out.println("Remaining Money : " + zoo.getRemainingMoney());
			System.out.println("Income Money Per Day : " + zoo.getIncome());
			
			boolean isEnoughArea = zoo.enoughArea();
			System.out.println("Enough Area : " + isEnoughArea);
			System.out.println("Animals In Zoo : " + zoo.animalCount());
			zoo.listAnimal();
			System.out.println();
			
			if(isEnoughArea) {
				zoo.buyNewAnimal(buyAnimalList[i % buyAnimalList.length]);
			}
		}
	}

}
