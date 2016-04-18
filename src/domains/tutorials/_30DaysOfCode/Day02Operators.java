package domains.tutorials._30DaysOfCode;

import java.util.Scanner;

public class Day02Operators {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble(); // original meal price
		int tipPercent = scan.nextInt(); // tip percentage
		int taxPercent = scan.nextInt(); // tax percentage
		scan.close();

		// Write your calculation code here.
		double tip = mealCost * ((double) tipPercent / 100);
		double tax = mealCost * ((double) taxPercent / 100);
		double cost = mealCost + tip + tax;

		// cast the result of the rounding operation to an int and save it as
		// totalCost
		int totalCost = (int) Math.round(cost);

		// Print your result
		System.out.println("The total meal cost is " + totalCost + " dollars.");
	}

}
