class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 1;
        int right = 1;
        for(int i = 1; right < nums.length ; i++){
            
            if(nums[i-1] == nums[i])
                right++;
            else{
                nums[left] = nums[right];
                left++;
                right++;
            }
        }
        
        return left;
    }
}