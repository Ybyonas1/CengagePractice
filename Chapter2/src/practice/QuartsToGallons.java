package practice;

public class QuartsToGallons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int QUARTS_IN_GALLONS = 4;
		int quartsNeeded = 18; 
		
		int gallons = quartsNeeded / QUARTS_IN_GALLONS;
		int quartsLeft = quartsNeeded % QUARTS_IN_GALLONS;
		
		System.out.println("A Job that needs " + quartsNeeded + " requires " + gallons + " gallons, plus " + quartsLeft + " Quarts");

	}

}
