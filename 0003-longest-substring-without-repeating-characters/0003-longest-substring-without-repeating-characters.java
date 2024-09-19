class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLen = 0;
        int currLen = 0;
        int i = 0;
        int j = -1;
        
        boolean[] set = new boolean[256];
        
        while( i < s.length()){
            char ch_to_acquire = s.charAt(i);
            while(set[ch_to_acquire]){
                j++;
                char ch_to_release = s.charAt(j);
                set[ch_to_release] = false;
            }
            set[ch_to_acquire] = true;
            
            currLen = i - j;
            maxLen = Math.max(currLen, maxLen);
            i++;
        }
        
        return maxLen;
        
        
        
    }
}