package domains.algorithms.warmup.a_very_big_sum;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int i = n;
		long sum = 0;
		while (i-- > 0) {
			sum += scanner.nextInt();
		}
		scanner.close();

		System.out.println(sum);
	}
}
