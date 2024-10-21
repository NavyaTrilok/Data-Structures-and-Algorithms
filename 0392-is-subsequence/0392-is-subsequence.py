class Solution(object):
    def isSubsequence(self, a, b):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        b_t = iter(b)
        
        for i in a:
            if i not in b_t:
                return False
        return True
        
        