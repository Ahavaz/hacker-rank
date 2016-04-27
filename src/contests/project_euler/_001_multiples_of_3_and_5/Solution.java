package contests.project_euler._001_multiples_of_3_and_5;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt();
			long sum = 0;
			long maxBy3 = (n - 1) / 3;
			long maxBy5 = (n - 1) / 5;
			long maxBy15 = (n - 1) / 15;
			sum += 3 * maxBy3 * (1 + maxBy3) / 2;
			sum += 5 * maxBy5 * (1 + maxBy5) / 2;
			sum -= 15 * maxBy15 * (1 + maxBy15) / 2;
			System.out.println(sum);
		}
		in.close();
	}
}
