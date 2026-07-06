package Arrays;

public class question05 {
    
    public static void main(String[] args) {
        
        System.out.println("Largest Element In Array ");

        // 1st array given 

        int[] arr ={1,8,7,56,90};

        // 2nd print array 

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            
            

            if(largest < arr[i]){

                largest = arr[i];
            }
 
        }
System.out.println("Largest Element = " + largest);


    }

}
