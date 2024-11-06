package Day3;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String lastName = getLastName(name).trim();
        String firstName = name.replace(lastName, "").trim();

//        System.out.println(firstName + "proov");
//        System.out.println(lastName + "proov");
        addGreeting();
        if (firstName.isEmpty()) {
            printName(capitalizeFirstLetter(lastName));
        } else {
            printName(capitalizeFirstLetter(firstName), capitalizeFirstLetter(lastName));
        }
//        if (firstName.equals("")) {
//            firstName = null;
//        }
//        printName(firstName, lastName);
    }



    public static void printName(String firstName, String lastName) {
        if (firstName.length() > 6) {
            System.out.print(firstName.charAt(0) + ". " + lastName);
        } else {
            System.out.print(firstName + " " + lastName);
        }
    }

    public static void printName(String name) {
        System.out.print(name.trim());
    }

    public static String getLastName(String name) {
        int index = name.lastIndexOf(" ");
        return name.substring(index + 1);
    }

    public static void addGreeting() {
        System.out.print("Tere, ");
    }

    public static String capitalizeFirstLetter(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}



