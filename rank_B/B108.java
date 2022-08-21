package rank_B;

import java.util.*;

public class B108 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] intArray = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = intArray[0];
        int M = intArray[1];
        // List<Integer> GondolaList = new ArrayList<Integer>();
        int[] ints = new int[N + M];
        int[] GroupNums = new int[M];
        int[] GondolaList = new int[N];
        // int[] results = int new[N];
        int N_GondolaSum = 0;
        int count = 0;

        for (int n = 0; n < N; n++) {
            int N_num = sc.nextInt();
            N_GondolaSum += N_num;
            GondolaList[n] = N_num;
        }

        for (int m = 0; m < M; m++) {
            GroupNums[m] = sc.nextInt();
        }

        int[] results = GondolaList;

        for (int groupNum : GroupNums) {
            int quotient = groupNum / N_GondolaSum;
            int remainder = groupNum % N_GondolaSum;
            int lap = quotient / GondolaList.length;
            Arrays.stream(results).forEach(n -> n * lap);
        }

        System.out.println(results);
    }

}
