package Arrrays;
/**
 * q09
 * 
 *  this question is TWO SUM 
 * 
 */
public class q09 {

    public static void main(String[] args) {
       
     int[] arr = { 1,5,8,-3};

     int target = 2 ;
     int num ;

     for (int i = 0; i < arr.length; i++) {
        
        for (int j = i+1; j <arr.length; j++) {
            
        if((arr[i] + arr[j]) == target){

            System.out.println("Yes The Sum Is target ");
        } 


        }
        
     }

    }
    
}