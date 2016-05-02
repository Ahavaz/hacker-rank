package domains.tutorials._30_days_of_code.day_26_nested_logic;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int aD = in.nextInt();
		int aM = in.nextInt();
		int aY = in.nextInt();

		int eD = in.nextInt();
		int eM = in.nextInt();
		int eY = in.nextInt();

		in.close();

		int fine = 0;
		if (aY <= eY) {
			if (aM <= eM) {
				if (aD > eD) {
					fine = (aD - eD) * 15;
				}
			} else {
				fine = (aM - eM) * 500;
			}
		} else {
			fine = 10000;
		}

		System.out.println(fine);
	}
}
