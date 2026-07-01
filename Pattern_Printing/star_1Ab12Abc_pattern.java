package Pattern_Printing;
/**
 * star_1Ab12Abc_pattern
 */
public class star_1Ab12Abc_pattern {

     public static void main(String[] args) {

        int n = 6;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if (i % 2 != 0) {      // Odd Row
                    System.out.print((char)('A' + j - 1) + " ");
                } else {               // Even Row
                    System.out.print(j + " ");
                }

            }

            System.out.println();
        }
}
}