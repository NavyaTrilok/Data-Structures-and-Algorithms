class Solution(object):
    def countGoodSubstrings(self, s):
        count = 0
        for i in range(len(s)-2):
            if len(set(s[i:i+3])) == 3:
                count+=1
        return count
        