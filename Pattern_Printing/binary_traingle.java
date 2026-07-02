package Pattern_Printing;

public class binary_traingle {
    


    public static void main(String[] args) {
        
        
        System.out.println(" Binary Trangle");
        

        int a = 5;

        for (int i = 0; i <= a ; i++) { // row
            

            for (int j = 1; j <= i; j++) { // col
                
                if ((i + j) % 2 == 0) {
                    System.out.print(" 1 ");
                }else{
                    System.out.print(" 0 ");
                }
                
            }

             System.out.println();
        }
    }
}
// 


