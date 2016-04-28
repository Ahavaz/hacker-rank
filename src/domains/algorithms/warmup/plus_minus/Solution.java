package domains.algorithms.warmup.plus_minus;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		float pos = 0;
		float neg = 0;
		float nul = 0;

		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			if (a > 0) {
				pos++;
			} else if (a < 0) {
				neg++;
			} else {
				nul++;
			}
		}
		in.close();

		String s = String.format("%.6f\n%.6f\n%.6f", pos / n, neg / n, nul / n);
		System.out.println(s.replace(",", "."));
	}
}
