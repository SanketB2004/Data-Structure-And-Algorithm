package Pattern_Printing;

public class star_cross {

    public static void main(String[] args) {

        System.out.println("Star Cross Pattern");

        int a = 5;

        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= a; j++) {

                if (i == j || i + j == a + 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }

            System.out.println();
        }
    }
}