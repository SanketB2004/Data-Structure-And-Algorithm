package Arrays;

import java.util.Scanner;

/**
 * arraybasic02
 */
public class arraybasic02 {

    // Output And Input in array

    public static void main(String[] args) {

        System.out.println("Sanket");

        int[] arr = { 5, -8, 2, 67, 43, -97 };

        // use loop direct print array
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");

        }
        System.out.println();

        int[] sanket = new int[10];
        // defult value 0
        int a = sanket.length;

        for (int i = 0; i < a; i++) {

            System.out.print(sanket[i] + " ");

        }

        // use of loop to array printing
        Scanner sc = new Scanner(System.in);

        System.out.println(); // new line print

        // input for use loops
        for (int i = 0; i < sanket.length; i++) {

            // int x = sc.nextInt();

            // sanket[i] = x;

            sanket[i]=sc.nextInt();

        }
        int e = sanket.length;

        for (int i = 0; i < e; i++) {

            System.out.print(2*sanket[i] + " "); //don guna multiply

        }

 
         



    }
}
