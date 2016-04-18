package domains.tutorials._30DaysOfCode;

import java.util.Scanner;

public class Day09Recursion {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		System.out.println(factorial(n));
	}

	private static int factorial(int n) {
		if (n > 1) {
			return n *= factorial(n - 1);
		} else {
			return 1;
		}
	}
}
