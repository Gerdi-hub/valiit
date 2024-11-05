package DayTwo;

import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Months {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String months = in.nextLine();
        String years = "JFMAMJJASOND";
        int index = years.lastIndexOf(months);
        int newIndex = months.length() + index;
        System.out.println(newIndex);
        System.out.println(years.length());
        if (newIndex < years.length()) {
            System.out.println(years.charAt(newIndex));
        } else if (newIndex == years.length()) {
            System.out.println(years.charAt(years.length() - newIndex));

        }else if (newIndex > years.length()) {
            System.out.println(years.charAt((newIndex % years.length()+1)));

        }



    }
}