class Solution(object):
    def findWordsContaining(self, words, x):
      
        """
        res = []
        
        for i in range(len(words)):
            for j in words[i]:
                if (j==x):
                    res.append(words.index(words[i]))
                    break
        return res
        """
        res = []
        for i in range(len(words)):
            if x in words[i]:
                res.append(i)
        return res