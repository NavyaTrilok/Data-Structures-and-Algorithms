class Solution(object):
    def scoreOfString(self, s):
        ans = 0
        for i in range(1, len(s)):
            ans += abs(ord(s[i-1]) - ord(s[i]))
            
        return ans
        