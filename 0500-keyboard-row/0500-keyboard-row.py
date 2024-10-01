class Solution(object):
    def findWords(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        
        l1 = set("qwertyuiop")
            
        l2 = set("asdfghjkl")
            
        l3 = set("zxcvbnm")
            
        ans = list()
            
        for word in words:
            lower_word = word.lower()
            if set(lower_word).issubset(l1) or set(lower_word).issubset(l2) or set(lower_word).issubset(l3):
                ans.append(word)
                    
        return ans
        