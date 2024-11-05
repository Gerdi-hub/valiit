package DayTwo;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to calculate? yes/no: ");
        String answer = scanner.nextLine();
        while (answer.equalsIgnoreCase("yes")) {
            System.out.print("Enter a number: ");
            if (scanner.hasNextInt()){;
                int n = scanner.nextInt();
                System.out.println(n + " + 1 = " + (n+1));
                scanner.nextLine();
            }
            else {
                System.out.println("This is not a number");
                scanner.nextLine();
            }
            System.out.print("Do you want to calculate? yes/no: ");
            answer = scanner.nextLine();
        }


    }
}
