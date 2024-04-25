class Solution(object):
    def countPrefixes(self, words, s):
        count=0
        for i in words:
            if (s[:len(i)]==i):
                count+=1
        return count
        