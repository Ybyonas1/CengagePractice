package practice;

import javax.swing.JOptionPane;

public class QuartsToGallons3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = JOptionPane.showInputDialog(null, "Please enter the quarts needed");
		int quartsNeeded = Integer.parseInt(input);
		
		String input2 = JOptionPane.showInputDialog(null, "How many quarts are in a gallon?");
		final int QUARTS_IN_GALLONS = Integer.parseInt(input2);
		
		int gallons = quartsNeeded / QUARTS_IN_GALLONS;
		int quartsLeft = quartsNeeded % QUARTS_IN_GALLONS;
		
		System.out.println("A Job that needs " + quartsNeeded + " requires " + gallons + " gallons, plus " + quartsLeft + " Quarts");
		
	}

}
