package domains.algorithms.warmup.diagonal_difference;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[][] m = new int[n][n];
		int soma = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				m[i][j] = scanner.nextInt();
				if (i == j) {
					soma += m[i][j];
				}
				if (i + j == n - 1) {
					soma -= m[i][j];
				}
			}
		}
		scanner.close();

		System.out.println(Math.abs(soma));
	}
}
