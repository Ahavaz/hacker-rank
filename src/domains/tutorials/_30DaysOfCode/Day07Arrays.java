package domains.tutorials._30DaysOfCode;

import java.util.Scanner;

public class Day07Arrays {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[n - i - 1] = in.nextInt();
		}
		in.close();

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
