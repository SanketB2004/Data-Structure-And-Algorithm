package Arrays;

// Print Max in of array

/**
 * question04
 */
public class question04 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        int n = arr.length;
        
        int mAX =arr[0];
        for (int i = 0; i < n; i++) {

             mAX = arr[i] ;

             if (arr[i]< mAX) {
                mAX= arr[i];
             }

               
            }

             System.out.println(mAX);
         
            

            

        }
       

    }