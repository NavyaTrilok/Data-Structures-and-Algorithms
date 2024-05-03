class Solution(object):
    def truncateSentence(self, s, k):
        words = s.split()
        count = 0
        ans = ""
        for word in words:
            count += 1
            if count < k:
                ans += word+" "
            if count == k:
                ans += word
        
        return ans
                
                
        
        