package domains.tutorials._30_days_of_code.day_25_running_time_and_complexity;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		while (T-- > 0) {
			int n = in.nextInt();
			boolean isPrime = true;

			if (n == 2) {
				isPrime = true;
			} else if (n % 2 == 0 || n == 1 || n == 9) {
				isPrime = false;
			} else {
				for (int i = 3; i < Math.sqrt(n); i += 2) {
					if (n % i == 0) {
						isPrime = false;
						break;
					}
				}
			}
			if (isPrime) {
				System.out.println("Prime");
			} else {
				System.out.println("Not prime");
			}
		}
		in.close();
	}
}
