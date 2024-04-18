class Solution(object):
    def isAcronym(self, words, s):
        i = 0
        count = 0
        for word in words:
            if i<len(s) and word[0] != s[i]:
                return False
            else:
                i = i+1
            count+=1
            
        
        if count == len(s):
            return True
        else:
            return False
        
                
        
        