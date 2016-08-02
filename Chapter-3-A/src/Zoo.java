import java.util.ArrayList;

import Animal.Animal;

public class Zoo {

	private int zooMoney = 500;
	private float zooArea = 50f;
	private ArrayList<Animal> animals;
	
	public Zoo() {
		// Add 5 Bear 10 Goat and 2 Shark
	}
	
	public void setPeopleEnterToday(int count) {
		animals = new ArrayList<Animal>();
	}
	
	public int getIncome() {
		return 0;
	}
	
	public int getRemainingMoney() {
		return 0;
	}
	
	public void calculateMoney() {
		
	}
	
	public boolean enoughArea() {
		return false;
	}
	
	public void buyNewAnimal(String name) {
		
	}
	
	public int animalCount() {
		return animals.size();
	}
	
	public void listAnimal() {
		/*
		 * For example (System.out.println Format) :
		 * Tiger 5
		 * Bear 2
		 * Shark 1
		 */
	}
}
