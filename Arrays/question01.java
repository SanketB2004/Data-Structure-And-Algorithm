package Arrays;

// Given an arraay print negative elements only

public class question01 {
    public static void main(String[] args) {

        int[] arr = { 4, -45, -55, 89, 7, 5, -556, 88, -88, };

        int n = arr.length;
boolean fount = false ;
        for (int i = 0; i < n; i++) {

            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");

                fount = true ;

                
            } 

           

        }
         if (!fount) {
                System.out.println("No negative value in your array");
            }
    }
}
