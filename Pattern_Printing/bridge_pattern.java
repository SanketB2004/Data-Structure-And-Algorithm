package Pattern_Printing;

public class bridge_pattern {
    public static void main(String[] args) {

        int n = 5;

        int nst = n - 1;
        int nsp = 1;

        // First line
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("* " );
        }
        System.out.println();

        // Remaining lines
        for (int i = 2; i <= n; i++) {

            // Left stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }

            // Middle spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            // Right stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }

            nst--;
            nsp += 2;

            System.out.println();
        }}
}
