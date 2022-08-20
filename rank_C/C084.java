package rank_C;

import java.util.*;

public class C084 {

    public static void main(String[] args) {
        try (
                Scanner sc = new Scanner(System.in)) {
            String line = sc.nextLine();
            int num = line.length();
            String upper = "";
            String lower = "";

            for (int i = 0; i < num + 2; i++) {
                upper += "+";
                lower += "+";
            }
            System.out.println(upper);
            System.out.println("+" + line + "+");
            System.out.println(lower);
        }
    }

}
