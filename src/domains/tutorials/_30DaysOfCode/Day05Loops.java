package domains.tutorials._30DaysOfCode;

import java.util.Scanner;

public class Day05Loops {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();

		for (int i = 1; i <= 10; i++) {
			StringBuilder sb = new StringBuilder("");
			int c = n * i;
			sb.append(n);
			sb.append(" x ");
			sb.append(i);
			sb.append(" = ");
			sb.append(c);
			System.out.println(sb);
		}
	}
}
