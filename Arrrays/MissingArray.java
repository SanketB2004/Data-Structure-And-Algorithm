class Solution {
    int missingNum(int arr[]) {
        // code here
        
        int n = arr.length + 1;
        
        int sum  = n*(n+1)/2 ;
        
        int arraySum = 0;
        
        for(int ele : arr){
            arraySum += ele;
        }
        
        return sum- arraySum ;
        
    }
}