package Arrays;

// q is search in array 

public class qsearchinarr {
    
    public static void main(String[] args) {
        
        int[] arr ={10,20,3,0,40,50,60,70,80,90,100};
int num = 125 ;
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] == num ){
                System.out.println("This element in array search " + num);
            }
            
            else{
                System.out.println("not in array this element" + num);
            }
        }
    }
}
