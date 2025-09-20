class Solution {
    public int maxSubArray(int[] nums) {

        int meh = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            meh += nums[i];
            maxSum = Math.max(maxSum, meh);
            if(meh < 0)
                meh = 0;
            
        }

        return maxSum;
        
    }
}