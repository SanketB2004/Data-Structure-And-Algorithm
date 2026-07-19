public class subarray {
    public static void main(String[] args) {
        
        int [] arr  = {2, 3, 5, -2, 7, -4};

        int sum = 0;
        int maxarr = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            
            sum = sum +arr[i];

            if (sum>maxarr) {
                maxarr = sum ;
            }else if (sum<0){
                sum = 0 ;
            }

            

        }
        System.out.println(maxarr);
    }
}
