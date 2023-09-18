class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = fibhelper(dp,n);
        return ans;
        
    }
    
    public int fibhelper(int[] dp, int n) {
         if(n == 0 || n == 1){
             return n;
         } 
        if(dp[n]!=-1){
            return dp[n];
        }
        int a = fibhelper(dp,n-1);
        int b = fibhelper(dp,n-2);
        
        dp[n] = a+b;
        return a+b;
    }
}