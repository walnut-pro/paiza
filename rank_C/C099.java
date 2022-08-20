package rank_C;

import java.util.*;

public class C099 {

    public static void main(String[] args) {
        try (
                Scanner sc = new Scanner(System.in)) {
            int[] intArray = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int squeareLength = intArray[1];

            int A = intArray[0] * squeareLength;
            int B = 0;

            for (int i = 1; i < intArray[0]; i++) {
                B += sc.nextInt();
            }
            System.out.println((A - B) * squeareLength);
        }
    }

}
