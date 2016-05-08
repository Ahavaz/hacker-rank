package domains.algorithms.implementation.sherlock_and_the_beast;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		while (T-- > 0) {
			int n = in.nextInt();

			if (n % 3 == 0) {
				n /= 3;
				for (int i = 0; i < n; i++) {
					System.out.print("555");
				}
			} else if ((n - 5) % 3 == 0 && n - 5 >= 0) {
				n = (n - 5) / 3;
				for (int i = 0; i < n; i++) {
					System.out.print("555");
				}
				System.out.print("33333");
			} else if ((n - 10) % 3 == 0 && n - 10 >= 0) {
				n = (n - 10) / 3;
				for (int i = 0; i < n; i++) {
					System.out.print(555);
				}
				System.out.print("3333333333");
			} else {
				System.out.print(-1);
			}
			System.out.println();
		}
		in.close();
	}
}
