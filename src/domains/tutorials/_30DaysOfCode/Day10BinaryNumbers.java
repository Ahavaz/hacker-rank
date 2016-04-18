package domains.tutorials._30DaysOfCode;

import java.math.BigInteger;
import java.util.Scanner;

public class Day10BinaryNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger n = in.nextBigInteger();
		in.close();

		String s = n.toString(2);
		String[] r = s.split("0+");

		BigInteger aux = BigInteger.valueOf(1);
		for (String i : r) {
			BigInteger k = new BigInteger(i);
			if (aux.compareTo(k) == -1) {
				aux = k;
			}
		}

		r = aux.toString().split("");
		System.out.println(r.length);
	}
}
