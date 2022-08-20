package rank_C;

import java.util.*;

public class C020 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] intArray = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int m = intArray[0];
        float p = (float) intArray[1] / 100;
        float q = (float) intArray[2] / 100;

        System.out.println(m * (1 - p) * (1 - q));

    }
}
