class Solution(object):
    def arrayStringsAreEqual(self, word1, word2):
        """"
        res1 = ""
        res2 = ""
        result = ""
        for word in word1:
            res1 += word
            print(res1)
            
        for word in word2:
            res2 += word
            print(res2)
            
        if res1 == res2:
            result = "true"
        else:
            result = "false"
            
        return result
        """
        word1 = "".join(word1)
        word2 = "".join(word2)
        
        return word1 == word2

        