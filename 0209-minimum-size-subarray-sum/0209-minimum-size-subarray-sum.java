class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int high = 0;
        int low = 0;
        int currentSum = 0;
        int minLenWindow = Integer.MAX_VALUE;
        
        while(high < nums.length){
            
            currentSum = currentSum + nums[high];
            high++;
            while(currentSum >= target){
                int len = high - low;
                minLenWindow = Math.min(minLenWindow,len);
                currentSum = currentSum - nums[low];
                low++;   
            }
            
        }
        
        return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;
        
    }
}