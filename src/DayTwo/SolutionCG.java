package DayTwo;

import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class SolutionCG {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = in.nextInt();
        String newString = s.replaceAll("-", " ");
        String arr[] = newString.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i].toUpperCase();
            System.out.print(word.charAt(n-1) + " ");
        }
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

//        System.out.println("Answer");
    }
}

