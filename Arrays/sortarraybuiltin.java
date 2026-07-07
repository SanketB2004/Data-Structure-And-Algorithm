
package Arrays;
import java.util.*;
/**
 * sort array built in
 */
public class sortarraybuiltin {

    public static void main(String[] args) {
        
        int[] arr ={4,1,5,7,-3,20,87,3};

        print(arr); // check array orignal

        Arrays.sort(arr); //in bilt sort method this

        print(arr); // chack sort array


    }
    public static void print(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}