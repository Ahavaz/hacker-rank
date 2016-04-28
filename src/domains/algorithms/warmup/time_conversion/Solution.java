package domains.algorithms.warmup.time_conversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String s12 = in.nextLine();
        in.close();

        SimpleDateFormat format12 = new SimpleDateFormat("hh:mm:ssaa");
        SimpleDateFormat format24 = new SimpleDateFormat("HH:mm:ss");

        Date date12 = format12.parse(s12);

        String s24 = format24.format(date12);

        System.out.println(s24);
    }
}
