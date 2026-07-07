package Arrays;
// q is multiplay odd indexed 2 and even to 10 add

public class arrayq07 {

    public static void main(String[] args) {
        
        int[] arr = { 10,20,30,40,50};

        for (int i = 0; i < arr.length; i++) {
            
            if(i % 2 == 0){
                arr[i] = arr[i] +10 ;

            }
            else{
                arr[i] = arr[i] * 2 ;

            }

            System.out.println(arr[i]);
        }

    }

    
}
