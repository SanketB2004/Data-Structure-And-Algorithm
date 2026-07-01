package Pattern_Printing;
/**
 * Alphanumeric_Triangle
 */
public class Alphanumeric_Triangle {

    public static void main(String[] args) {
        
        
        System.out.println("Alphanumeric  Pattern");

        int a = 5;

        for (int i = 0; i <= a ; i++) { // row
            

            for (int j = 0; j <= i; j++) { // col
                
                System.out.print((char)('A' + j)+ " ");
            }

             System.out.println();
        }
    }
}
