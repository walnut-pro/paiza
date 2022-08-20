package rank_C;

import java.util.*;

public class C097 {

    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int[] intArray = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 1; i < intArray[0] + 1; i++) {
            if (i % intArray[1] == 0 && i % intArray[2] == 0) {
                System.out.println("AB");
                continue;
            } else if (i % intArray[1] == 0 && i % intArray[2] != 0) {
                System.out.println("A");

            } else if (i % intArray[1] != 0 && i % intArray[2] == 0) {
                System.out.println("B");

            } else {
                System.out.println("N");
            }

        }

    }

}
