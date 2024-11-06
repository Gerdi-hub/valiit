package Day3;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        String[] carBrand = {"Tesla", "Honbda", "Audi"};
        String[] carModel = {"S", "Civic", "A3"};

        for (int i = 0; i < carBrand.length; i++) {
            System.out.println(carBrand[i] + " " + carModel[i]);
        }

        Arrays.sort (carBrand);
        System.out.println(Arrays.toString(carBrand));


    }


}
