
public class segragates_0s1s {

    
    public static void main(String[] args) {
        
        int [] arr = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        int numberOfZero = 0; 
        int numberOfOnes = 0 ;

        for (int ele : arr) {

            if (ele == 0)numberOfZero++;
            else numberOfOnes++;
             
            

                

            }
            for (int i = 0; i < arr.length; i++) {
                
                if (i<numberOfZero) {
                    arr[i] = 1;
                }else {
                    arr[i] = 0 ;
                }

    }

    for (int i = 0; i < arr.length; i++) {
        
        System.out.print(arr[i]+ " ");
    }
    
        }
    }
    