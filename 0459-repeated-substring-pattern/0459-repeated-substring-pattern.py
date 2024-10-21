class Solution(object):
    def repeatedSubstringPattern(self, s):
        """
        :type s: str
        :rtype: bool
        """
        for k in range(1, len(s)//2 +1):   
            if s == s[k:] + s[:k]:
                return True
        return False
        