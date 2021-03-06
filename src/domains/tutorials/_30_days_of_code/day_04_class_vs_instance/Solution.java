package domains.tutorials._30_days_of_code.day_04_class_vs_instance;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int age = in.nextInt();
			Solution.Person p = new Solution().new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		in.close();
	}

	public class Person {
		private int age;

		public Person(int initialAge) {
			if (initialAge < 0) {
				System.out.println("Age is not valid, setting age to 0.");
				age = 0;
			} else {
				age = initialAge;
			}
		}

		public void amIOld() {
			if (age < 13) {
				System.out.println("You are young.");
			} else if (age < 18) {
				System.out.println("You are a teenager.");
			} else {
				System.out.println("You are old.");
			}
		}

		public void yearPasses() {
			age++;
		}
	}
}
