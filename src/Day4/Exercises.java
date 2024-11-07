package Day4;

import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {
        int [] myArray = {1, 2, 3, 4, 5};
        int [] myArray2 = {10,20,30,40,50};

        System.out.println(myArray2[2]);

        int [] myArray3 = {5, 10, 15, 20};
        myArray3[1] = 12;
        System.out.println(Arrays.toString(myArray3));

        for (int i = 0; i < myArray3.length; i++) {
            System.out.print(myArray3[i] + " ");
        }

        int [] myArray4 = {8, 6, 7, 5, 0, 9};
        System.out.println(myArray4.length);

        int [] myArray5 = {4, 2, 8, 1, 6};
        int sum = 0;
        for (int i = 0; i < myArray5.length; i++) {
            sum += myArray5[i];
        }
        System.out.println(sum);
    }


}
