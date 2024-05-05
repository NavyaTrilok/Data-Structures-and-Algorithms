class Solution {
    public int maximizeSum(int[] arr, int k) {
        
        int max = arr[0];
        
        for(int i = 0; i < arr.length; i++){
            if (max < arr[i])
                max = arr[i];
        }
        
        int result = max;
        for(int i = 1; i < k ; i++){
            result += ++max;
        }
        
        return result;
        
    }
}