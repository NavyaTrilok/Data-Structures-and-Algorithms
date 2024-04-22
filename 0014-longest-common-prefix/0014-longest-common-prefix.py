class Solution(object):
    def longestCommonPrefix(self, strs):
        v = sorted(strs)
        first = v[0]
        last = v[-1]
        ans = ""
        for i in range(min(len(first),len(last))):
            if(first[i]!=last[i]):
                return ans 
            ans += first[i]
            
        return ans
                
        