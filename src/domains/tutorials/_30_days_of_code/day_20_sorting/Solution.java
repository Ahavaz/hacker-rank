package domains.tutorials._30_days_of_code.day_20_sorting;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			int k = in.nextInt();
			a[i] = k;
		}
		in.close();

		int numberOfSwaps = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
					int aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;
					numberOfSwaps++;
				}
			}

			if (numberOfSwaps == 0) {
				break;
			}
		}

		System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[n - 1]);
	}
}
