package Methods_01;

import java.util.Scanner;

public class ncrPrint {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();


        int factorialA = factorialCalculator(a);
        int factorialB  = factorialCalculator(b);

        // int randnminus = factorialCalculator(a-b);

int ncr =  factorialA / (factorialB * factorialCalculator(a - b));

int npr = factorialCalculator(a)/factorialCalculator(a-b);
       
        System.out.println(ncr + " This Is ncr");

        System.out.println(npr+ " This Is npr");

        ;

    }

    public static int factorialCalculator(int a) {
        int factorial = 1;
        for (int i = 1; i <= a; i++) {

            factorial *= i;

        }
        return factorial;
    }
}