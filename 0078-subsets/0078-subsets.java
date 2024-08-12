class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
                
        int n = nums.length;
        int total = (int) Math.pow(2,n);
        
        List<List<Integer>> arrlst = new ArrayList<>();
        for(int i = 0; i < total; i++ )
        {
            List<Integer> sarrlst =  new ArrayList<>();
            int num=i;
            for(int j=n-1;j>=0;j--)
            {
                int rem = num % 2;
                num = num/2;
                
                if(rem == 1 )
                {
                    sarrlst.add(nums[j]);
                }
            }
            arrlst.add(sarrlst);
        }
        return arrlst;
        
    }
}