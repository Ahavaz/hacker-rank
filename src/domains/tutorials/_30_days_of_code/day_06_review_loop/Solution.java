package domains.tutorials._30_days_of_code.day_06_review_loop;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.nextLine();

		for (int i = 0; i < t; i++) {
			String s = in.nextLine();
			char[] c = s.toCharArray();

			for (int j = 1; j < c.length; j++) {
				if (Math.abs(c[j] - c[j - 1]) == Math.abs(c[c.length - j - 1] - c[c.length - j])) {
					if (j == c.length - 1) {
						System.out.println("Funny");
					}
					continue;
				} else {
					System.out.println("Not Funny");
					break;
				}
			}
		}
		in.close();
	}
}
