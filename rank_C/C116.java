package rank_C;

import java.util.*;

public class C116 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int[] intArray = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int M = intArray[1];

            int[] numArr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int count = 0;
            boolean NG_flag = false;

            for (int num : numArr) {
                if (num == 0) {
                    count += 1;
                    if (count == M) {
                        System.out.println("NG");
                        NG_flag = true;
                        break;

                    }
                } else {
                    count = 0;
                }
            }
            if (NG_flag == false) {
                System.out.println("OK");
            }
        }
    }
}
