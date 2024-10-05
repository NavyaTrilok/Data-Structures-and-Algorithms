class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        
        mapST = {}
        mapTS = {}
        
        for i in range(len(s)):
            c1 = s[i]
            c2 = t[i]
            
            if (c1 in mapST and (mapST[c1] != c2)) or (c2 in mapTS and (mapTS[c2] != c1)):
                    return False
                
            mapST[c1] = c2
            mapTS[c2] = c1
                
        return True
            
            
            
        