 package Arrrays;

/**
 * Second Max
 */
public class SeconsdMax {

     public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int max = arr[0];
        int secondMax = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("Max = " + max);
        System.out.println("Second Max = " + secondMax);
    }
}
    

