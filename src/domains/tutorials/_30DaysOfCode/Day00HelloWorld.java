package domains.tutorials._30DaysOfCode;

import java.util.Scanner;

public class Day00HelloWorld {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		in.close();

		System.out.println("Hello, World.");

		System.out.println(inputString);
	}
}
