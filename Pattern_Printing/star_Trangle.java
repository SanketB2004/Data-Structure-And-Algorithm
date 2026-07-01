package Pattern_Printing;

/**
 * star_Trangle
 */
public class star_Trangle {

    public static void main(String[] args) {
        
        
        System.out.println("Star  Pattern");

        int a = 5;

        for (int i = 0; i <= a ; i++) { // row
            

            for (int j = 1; j <= i; j++) { // col
                
                System.out.print(" * ");
            }

             System.out.println();
        }
    }
}
