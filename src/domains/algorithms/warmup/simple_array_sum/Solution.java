package domains.algorithms.warmup.simple_array_sum;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int i = 0;
		int sum = 0;
		while (i < n) {
			sum += scanner.nextInt();
			i++;
		}
		scanner.close();

		System.out.println(sum);
	}
}
