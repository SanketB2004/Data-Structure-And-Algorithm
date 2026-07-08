package Arrrays;

public class reverseAraay {
    public static void main(String[] args) {
        
        // Reerace Array 

          int [] arr = {1,2,3,4,5,6,7,8,9};


         int n = arr.length;

         int i = 2 , j = arr.length -3;


         while (i<j) {
            int temp = arr[i];

            arr[i]=arr[j];

            arr[j]=temp;
            i++;
            j--;
         }

         for (int ele : arr) {
            System.out.print(ele);
         }



        

    }
}
