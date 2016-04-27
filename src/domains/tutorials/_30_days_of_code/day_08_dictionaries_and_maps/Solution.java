package domains.tutorials._30_days_of_code.day_08_dictionaries_and_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, String> phoneBook = new HashMap<String, String>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			String phone = in.next();
			phoneBook.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			String r = phoneBook.get(s);
			System.out.println((r != null) ? s + "=" + r : "Not found");
		}
		in.close();
	}
}
