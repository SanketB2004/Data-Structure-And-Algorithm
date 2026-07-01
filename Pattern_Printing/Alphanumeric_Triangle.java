package Pattern_Printing;
/**
 * Alphanumeric_Triangle
 */
public class Alphanumeric_Triangle {

    public static void main(String[] args) {
        
        
        System.out.println("Alphanumeric  Pattern");

        int a = 5;

        for (int i = 1; i <= a ; i++) { // row
            

            for (int j = 1; j <= a -i +1; j++) { // col
                
                System.out.print( "* ");
            }

             System.out.println();
        }
    }
}
