package Day4;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] cars = {"Fornd", "Honda", "Audi", "BMW"};
        int x = 1;
        printLoop(arr);
        printLoop2(cars);
        posNr(x);
        evenNumbers();
        multiply();

    }

    public static void printLoop(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public static void printLoop2(String[] arr) {
        for (String car : arr) {
            System.out.print(car + " ");
        }
        System.out.println("\n");
    }

    public static void posNr(int x) {
        int count = 1;
        int sum = 0;
        while (count <= 100) {

            sum += x;
            count++;
            x++;
        }
        System.out.println(sum);
    }
 public static void evenNumbers (){

        for (int i = 2; i <= 20; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
 }

 public static void multiply (){
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 * " + i + " = " + i * i);
        }
 }

}
