package Pattern_Printing;

/**
 * alphabet_Square ?? This Is Big Later
 */
public class alphabet_Square {

    public static void main(String[] args) {
        
        
        int a = 5;

        for (int i = 1; i <= a ; i++) { // row
            

            for (int j = 1; j <= a; j++) { // col
                
                System.out.print((char)('A'+j )+" ");
            }

             System.out.println();
        }
    }
}
