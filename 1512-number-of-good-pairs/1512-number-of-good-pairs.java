class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0 ; i < nums.length; i++){
            for(int j = nums.length-1; j >= 0; j--){
                if (nums[i] == nums[j] && i < j)
                    count++;
            }
        }
        
        return count;
    }
}