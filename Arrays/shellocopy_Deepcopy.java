package Arrays;

import java.util.Arrays;

public class shellocopy_Deepcopy {
    

    public static void main(String[] args) {
        
         int[] arr = {10,30,40,50};
        // int[] x = arr; // x is shallow copy is arr //

        // x[0] = 100 ; // change x to change arr 
        // System.out.println(arr[0]); // change

      int[] deep = Arrays.copyOf(arr , arr.length); // deep copy 
 // secont method deep copy make 
 int [] brr = new int[arr.length];
 
      deep[0] = 500; // change in deep but not change arr

      System.out.println(arr[0]); // not change arr checck and see this its deep copy not ariganal array change


      System.out.println(deep[0]); // but deep is change
 

        
    }


}
