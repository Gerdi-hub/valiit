package Day3;

public class Methods {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        getArea(x,y);
    }
    public static void getArea(int x, int y) {
        int z = x*y;
        checkArea(z);

    }
    public static void checkArea(int z) {
        if (z > 20){
            System.out.println("Area is bigger than 20");
        } else if (z ==20) {
            System.out.println("Area is 20");
        }else {
            System.out.println("Area is smaller than 20");
        }
    }

}
