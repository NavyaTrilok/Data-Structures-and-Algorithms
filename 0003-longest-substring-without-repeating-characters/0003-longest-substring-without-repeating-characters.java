class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int si = 0;
        int ei = 0;
        int count = 0;
        int len = 0;

        int[] fre = new int[128];

        while(ei < n){
            if(fre[s.charAt(ei)] == 1){
                count++;
            }
            fre[s.charAt(ei)]++;
            ei++;

            while(count > 0){
                if(fre[s.charAt(si)] == 2){
                    count--;
                }
                fre[s.charAt(si)]--;
                si++;
            }
            len = Math.max(len,ei-si);
        }
        return len;   
    }
}