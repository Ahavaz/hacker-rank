package domains.tutorials._30_days_of_code.day_00_hello_world;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		in.close();

		System.out.println("Hello, World.");

		System.out.println(inputString);
	}
}
