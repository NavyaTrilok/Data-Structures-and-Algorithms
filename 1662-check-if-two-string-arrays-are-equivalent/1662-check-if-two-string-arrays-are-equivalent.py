class Solution(object):
    def arrayStringsAreEqual(self, word1, word2):
        res1 = ""
        res2 = ""
        for word in word1:
            res1 += word
            
        for word in word2:
            res2 += word
        
        if res1 == res2:
                return True
        else:
                return False
        