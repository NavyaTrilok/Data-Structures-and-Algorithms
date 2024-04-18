class Solution(object):
    def truncateSentence(self, s, k):
        words = s.split(" ")
        count = 0
        res = ""
        for word in words:
            count += 1
            if count == k:
                res +=word
            else:
                res += word+" "
            if count == k:
                return res
                
            
        