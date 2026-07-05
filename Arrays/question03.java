package Arrays;


// Print Product of array

/**
 * question03
 */
public class question03 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        int n = arr.length;
        
        int product = 1;
        for (int i = 0; i < n; i++) {

             product = product * arr[i];
         
            

            

        }System.out.print(product);
       

    }

}