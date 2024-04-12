class Solution(object):
    def findWordsContaining(self, words, x):
      
       
        res = set()
        
        for i in range(len(words)):
            if x in words[i]:
                res.add(i)
                   
        return res
        """
        res = []
        for i in range(len(words)):
            if x in words[i]:
                res.append(i)
        return res
         """