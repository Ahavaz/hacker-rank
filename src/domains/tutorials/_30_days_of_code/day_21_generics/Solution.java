package domains.tutorials._30_days_of_code.day_21_generics;

public class Solution {

	public static <E> void printArray(E[] array) {
		for (E e : array) {
			System.out.println(e);
		}
	}

	public static void main(String args[]) {
		Integer[] intArray = { 1, 2, 3 };
		String[] stringArray = { "Hello", "World" };

		printArray(intArray);
		printArray(stringArray);

		if (Solution.class.getDeclaredMethods().length > 2) {
			System.out.println("You should only have 1 method named printArray.");
		}
	}
}
