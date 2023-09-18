class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = climbStairshelper(dp,n);
        return ans;
    }
    
    public int climbStairshelper(int[] dp, int n) {
        if(n==1||n==2){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        
        int a = climbStairshelper(dp,n-1);
        int b = climbStairshelper(dp,n-2);
        
        dp[n] = a + b;
        return a+b;
    }
    
}