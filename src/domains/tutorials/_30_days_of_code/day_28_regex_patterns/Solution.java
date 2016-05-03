package domains.tutorials._30_days_of_code.day_28_regex_patterns;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		ArrayList<String> list = new ArrayList<>();

		String regEx = "(@gmail)";
		Pattern p = Pattern.compile(regEx);

		while (T-- > 0) {
			String name = in.next();
			String email = in.next();

			Matcher m = p.matcher(email);
			if (m.find()) {
				list.add(name);
			}
		}
		in.close();

		list.sort(null);
		for (String name : list) {
			System.out.println(name);
		}
	}
}
