package domains.tutorials._30DaysOfCode.Day112DArrays;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		in.close();

		int hourglassSum = -63;

		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = 0; j < arr[i].length - 2; j++) {
				int sum = 0;
				for (int k = i; k < i + 3; k++) {
					for (int l = j; l < j + 3; l++) {
						if (k == i + 1 && (l == j || l == j + 2)) {
							continue;
						}
						sum += arr[k][l];
					}
				}

				if (sum > hourglassSum) {
					hourglassSum = sum;
				}
			}
		}

		System.out.println(hourglassSum);

		// int hourglass = (arr.length - 2) * (arr[0].length - 2);
		// System.out.println(hourglass);

		// for (int[] row : arr) {
		// for (int i : row) {
		// System.out.print(i + "\t");
		// }
		// System.out.println("\n\n\n");
		// }

		// System.out.println(Arrays.deepToString(arr));
	}
}
