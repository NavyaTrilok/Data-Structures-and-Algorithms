class Solution {
    public int firstMissingPositive(int[] nums) {
        //step1: Mark elements which are out of range and manage presence of one
        boolean one = false;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
                one = true;
            }
            if( nums[i] < 1 || n < nums[i]){
                nums[i] = 1;
            }
        }
        if(one == false) return 1;

        //step2: Map elements with index
        for(int i = 0; i < n; i++){
            int idx = Math.abs(nums[i]);
            nums[idx - 1] = -Math.abs(nums[idx - 1]);
        }

        //step3: Find out missing integer
        for(int i = 0; i < n; i++){
            //if element is positive that mean idx+1 is missing int the array
            if(nums[i] > 0) return i + 1;
        }

        return n + 1;
        
    }
}