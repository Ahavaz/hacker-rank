package domains.tutorials._30DaysOfCode;

import java.util.Scanner;

public class Day01DataTypes {
	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		Scanner scan = new Scanner(System.in);

		int j;
		double f;
		String p;

		j = scan.nextInt();
		f = scan.nextDouble();
		scan.nextLine();
		p = scan.nextLine();

		System.out.println(i + j);
		System.out.println(d + f);
		System.out.println(s + p);

		scan.close();
	}
}
