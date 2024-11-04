public class IfElse {
    public static void main(String[] args) {
        // IF
        int a = 22;
        int b = 22;
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