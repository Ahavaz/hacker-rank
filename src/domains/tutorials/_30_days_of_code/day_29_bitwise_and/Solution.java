package domains.tutorials._30_days_of_code.day_29_bitwise_and;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		while (T-- > 0) {
			int n = in.nextInt();
			int k = in.nextInt();
			int max = -1;

			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = i + 1;
			}

			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					int aux = a[i] & a[j];
					if (aux < k && aux > max) {
						max = aux;
					}
				}
			}

			System.out.println(max);
		}
		in.close();
	}
}
