package domains.tutorials._30_days_of_code.day_14_scope;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference D = new Difference(a);

		D.computeDifference();

		System.out.print(D.maximumDifference);
	}
}

class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] a) {
		elements = a;
	}

	public void computeDifference() {
		Arrays.sort(elements);
		maximumDifference = elements[elements.length - 1] - elements[0];
	}
}
