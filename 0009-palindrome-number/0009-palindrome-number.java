class Solution {
    public boolean isPalindrome(int x) {

        if(x<0)
            return false;
        int count=0;
        int ans=0;
        int temp=x;
        while(x!=0)
        {
            int rem=x%10;
            ans=rem+ans*10;
            x=x/10;
        }
        System.out.println(ans);
        if(temp==ans)
            return true;
        else
            return false;
        
        
    }
}