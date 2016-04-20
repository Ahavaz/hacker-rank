package domains.tutorials._30DaysOfCode.Day16ExceptionsStringToInteger;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();

		try {
			int num = Integer.parseInt(s);
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Bad String");
		}
	}
}
