package DayTwo;

import java.util.Scanner;

public class StringsCG {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        char ch = x.charAt(0);

        StringBuilder newWord = new StringBuilder();
        newWord.append(ch);

        for (int i = 0; i < x.length(); i++) {
            if (ch != x.charAt(i)) {
                newWord.append(x.charAt(i));
                ch = x.charAt(i);

            }

        }
        System.out.println(newWord);
    }
    // Write an answer using System.out.println()
    // To debug: System.err.println("Debug messages...");


}

