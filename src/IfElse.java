import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // IF
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert a: ");
        int a = sc.nextInt();
        System.out.print("Insert b: ");
        int b = sc.nextInt();
        if (a > b && b > 0) {
            System.out.println("a is bigger then  and b is positive");
        } else if (b > a && a > 0) {
            System.out.println("b is bigger then a and a is positive");
        } else if ((a == b) || (b < 0) && (a < 0)) {
            System.out.println("a and b are either equal or both are negative");
        } else {
            System.out.println("No specific conditions were met");
        }

//        System.out.println(a<b ? "a<b" : "b<a");


    }
}