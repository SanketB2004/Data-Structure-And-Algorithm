package Pattern_Printing;

// public class spiral {
    
//     public static void main(String[] args) {
        
//         System.out.println("Spiral Pattern Printing");

//         int n = 4;

//         for (int i = 1; i <= 2*n-1; i++) {

//             for (int j = 1; j <=2*n-1; j++) {
//                 int a = i , b = j ;
//                 if (i>n) a=2*n-i;
//                 if(j>n) b =2*n-j;
                    
                
//                 System.out.print(Math.min(a, b)+" ");
//             }
//             System.out.println();
//         }

//     }
// }

/**
 * spiral
 */
public class spiral {

    public static void main(String[] args) {
        
        System.out.println("Spiral Number Code Self Wrie Not Any One Ok");

        int n = 4 ;

        for (int i = 1; i <= 2*n-1; i++) {
            
            for (int j = 1; j <= 2*n-1; j++) {
                
                int a = i , b = j ; 

                if (i>n) a=2*n-i; 
                if (j>n) b=2*n-j;
                
                System.out.print(Math.min(a, b)+" ");
                    
                
            }
            System.out.println();
        }
    }
}