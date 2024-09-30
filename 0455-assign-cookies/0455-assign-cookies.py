class Solution(object):
    def findContentChildren(self, g, s):
        """
        :type g: List[int]
        :type s: List[int]
        :rtype: int
        """
        g.sort()
        s.sort()
        
        #ans = set();
        i = 0
        j = 0
        
        while i < len(g) and j < len(s):
                if g[i] <= s[j]:
                    #ans.add(g[i])
                    i = i + 1
                j = j + 1
                    
        return i
        