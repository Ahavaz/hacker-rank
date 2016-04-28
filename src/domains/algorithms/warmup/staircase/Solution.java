package domains.algorithms.warmup.staircase;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();

		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder("");
			for (int j = 0; j < n - i - 1; j++) {
				sb.append(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				sb.append("#");
			}
			System.out.println(sb);
		}
	}
}
