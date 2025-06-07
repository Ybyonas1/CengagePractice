package practice;

import java.util.Scanner;

public class QuartsToGallons2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("Please enter the quarts needed");
		int quartsNeeded = inputDevice.nextInt();

		System.out.println("How many quarts are in a gallon?");
		final int QUARTS_IN_GALLONS = inputDevice.nextInt();
		
		
		int gallons = quartsNeeded / QUARTS_IN_GALLONS;
		int quartsLeft = quartsNeeded % QUARTS_IN_GALLONS;
		
		System.out.println("A Job that needs " + quartsNeeded + " requires " + gallons + " gallons, plus " + quartsLeft + " Quarts");

	}
}
