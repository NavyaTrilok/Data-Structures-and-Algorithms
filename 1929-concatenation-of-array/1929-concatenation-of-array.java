class Solution {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int ans[] = new int[2*l];
        int i,j;
        for(i = 0; i < l; i++ ){
            ans[i] = nums[i];
        }
        j = i;
        for(i = 0 ;i < l; i++){
            ans[j] = nums[i];
            j++;
        }
        
        return ans;
    }
}