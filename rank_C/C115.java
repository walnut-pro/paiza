package rank_C;

import java.util.*;

public class C115 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArray = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        for (int i = 1; i < numArray[0]; i++) {
            int num = sc.nextInt();
            if (num <= numArray[1]) {
                sum += num;
            }

        }
        System.out.println(sum);

    }

}
