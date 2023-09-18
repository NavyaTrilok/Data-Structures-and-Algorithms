class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = numSquareshelper(dp,n);
        return ans;
        
    }
    
    public int numSquareshelper(int[] dp, int n) {
          if(n==1 || n==0){
                return dp[n]=n;
            }
          if(dp[n]!=-1){
              return dp[n];
          }
        
        int smallest = Integer.MAX_VALUE;
        for(int i = 1; i*i <= n; i++){
            int temp = numSquareshelper(dp, n-(i*i));
            smallest = Math.min(smallest, temp);
            
        }
        dp[n] = smallest+1;
        return smallest+1;
    }
}
