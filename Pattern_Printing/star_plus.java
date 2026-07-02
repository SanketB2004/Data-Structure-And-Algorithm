package Pattern_Printing;

public class star_plus {
    
    
    public static void main(String[] args) {
        

        System.out.println("Star Plus Pattern");

        int a = 5;

for (int i = 1; i <= a; i++) {

    for (int j = 1; j <= a; j++) {
int b = 3;
        if ( j == 3  ) {
            System.out.print(" * ");
        }else if (i == 3  ) {
            System.out.print(" * ");
        }

         else  {
            System.out.print("   ");
        }

    }

    System.out.println();
}
        }
        
    
    
}
