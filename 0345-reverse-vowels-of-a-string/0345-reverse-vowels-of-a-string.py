class Solution(object):
    def reverseVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        
        i = 0
        j = len(s) - 1
        
        a = set("aeiouAEIOU")
        
        p = list(s)
        
        while(i < j):
            if p[i] not in a:
                i = i + 1
            elif p[j] not in a:
                j = j - 1
            else:
                p[i] , p[j] = p[j] , p[i]
                i = i + 1
                j = j - 1
                
        return ''.join(p)
          
        
        