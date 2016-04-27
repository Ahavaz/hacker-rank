package domains.tutorials._30_days_of_code.day_16_exceptions_string_to_integer;

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
