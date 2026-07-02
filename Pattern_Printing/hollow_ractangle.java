package Pattern_Printing;

/**
 * hollow_ractangle
 */
public class hollow_ractangle {

    public static void main(String[] args) {
        

        System.out.println("Hollow Ractangle");

        int a = 8;

for (int i = 1; i <= a; i++) {

    for (int j = 1; j <= a; j++) {

        if (i == 1 || i == a || j == 1 || j == a) {
            System.out.print(" * ");
        } else {
            System.out.print("   ");
        }

    }

    System.out.println();
}
        }
        
        

    }
