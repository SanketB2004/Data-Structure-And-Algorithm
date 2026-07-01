package Pattern_Printing;
/**
 * number_Square
 */
public class number_Square {

    public static void main(String[] args) {
        
        
        
        System.out.println("Squre Pattern");

        int a = 5;

        for (int i = 1; i <= a ; i++) { // row
            

            for (int j = 1; j <= a; j++) { // col
                
                System.out.print(j +" ");
            }

             System.out.println();
        }
        
        
    }
}