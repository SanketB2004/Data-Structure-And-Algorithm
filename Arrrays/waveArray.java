class Solution {
    public void sortInWave(int arr[]) {
        // code here
        int b = 1 ;
        for(int i = 0 ; i < arr.length-1; i += 2 ){
            
            int temp = arr[i] ;
            
            arr[i] = arr[b];
            
            arr[b] = temp;
            
            b+=2;
        }
        
        
    }
}
