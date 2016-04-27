package domains.algorithms.implementation.angry_professor;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		String[] a = new String[t];

		for (int c = 0; c < t; c++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int s = 0;

			for (int i = 0; i < n; i++) {
				int h = in.nextInt();
				if (h <= 0) {
					s++;
				}
			}
			if (s >= k) {
				a[c] = "NO";
			} else {
				a[c] = "YES";
			}
		}
		in.close();

		for (String s : a) {
			System.out.println(s);
		}
	}
}
