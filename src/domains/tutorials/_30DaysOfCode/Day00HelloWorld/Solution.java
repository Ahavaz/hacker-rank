package domains.tutorials._30DaysOfCode.Day00HelloWorld;

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
